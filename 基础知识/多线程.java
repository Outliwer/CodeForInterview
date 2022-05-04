Java多线程：

实现：

class MyThread extends Thread {
	@Override
	public void run(){
		for (i = 0; i < 100; i++) {
              System.out.println(Thread.currentThread().getName() + " " + i);
        }
	}
}

class MyThread1 implements Runnable {
	@Override
	public void run(){
		for (i = 0; i < 100; i++) {
              System.out.println(Thread.currentThread().getName() + " " + i);
        }
	}
}



public class ThreadTest {
    public static void main(String[] args) {

        Callable<Integer> myCallable = new MyCallable();    // 创建MyCallable对象
        FutureTask<Integer> ft = new FutureTask<Integer>(myCallable); //使用FutureTask来包装MyCallable对象

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 30) {
                Thread thread = new Thread(ft);   //FutureTask对象作为Thread对象的target创建新的线程
                thread.start();                      //线程进入到就绪状态
            }
        }

        System.out.println("主线程for循环执行完毕..");
        
        try {
            int sum = ft.get();            //取得新创建的新线程中的call()方法返回的结果
            System.out.println("sum = " + sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
class MyCallable implements Callable<Integer> {
    private int i = 0;
    // 与run()方法不同的是，call()方法具有返回值
    @Override
    public Integer call() {
        int sum = 0;
        for (; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            sum += i;
        }
        return sum;
    }
}

Thread类本身也是实现了Runnable接口
而run()方法最先是在Runnable接口中定义的方法