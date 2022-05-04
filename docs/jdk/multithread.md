## 多线程相关

* `volatile` 关键字
    * `Java` 内存模型 
        * 每条线程都有**自己**的工作内存

        
        * **工作内存**保存了被该线程使用到的变量的**主内存的副本**拷贝
        
        * 变量值的传递需要通过主内存完成（可能存在**多线程问题**）
    * 解决方法：
        * 使用`volatile`时的内存屏障
            * 读的时候：
                * 读之后
                    * `LL`内存屏障
                        * 读操作重复 
                    * `LS`内存屏障
                        * 写操作重复
                
                    ![](https://lh3.googleusercontent.com/-ScyxbdnyQxg/W4v4dEiNkXI/AAAAAAAAAAU/oHCMnvAJ_oUhsfCLW4D96C5v7qBWHP_8ACHMYCw/I/15358997635999.jpg)
 
            * 写的时候：
                * 写之前
                    * `SS`内存屏障
                * 写之后  
                    * `SL`内存屏障（**保守策略**）
                    * 它会使该屏障之前的所有内存访问指令(存储指令和访问指令)**完成**之后,才执行该屏障之后的内存访问指令
                    
                ![](https://lh3.googleusercontent.com/-wMq8yyMGtxQ/W4v4nI5kdJI/AAAAAAAAAAc/ItNT57NQKEgAEg_-rJDryH1nIFDtL3y_ACHMYCw/I/15358998040880.jpg)

        * `Store`
            * 将处理器缓存中的数据刷新到内存 
        * `Load`
            * 内存拷贝数据到缓存 
        * `happens-before `
    
    
* `cas` 算法
    * **硬件**对于并发操作的支持 
    * 内存值`V`、预估值`A`、更新值`B`
    * 提供了很多支持原子操作的类：`AtomicInteger`
*  `threadLocal`
    *  在当前线程中保存的变量副本
    *  实际的通过`ThreadLocal`创建的副本是存储在每个线程自己的`threadLocals`中的
    
    *  继承自`WeakReference`：当`ThreadLocal`不再被引用时，因为弱引用机制原因，当`jvm`发现内存不足时，会自动回收弱引用指向的实例内存
    
    *  键值为当前`ThreadLocal`变量，`value`为变量副本
    *  请求调用链中信息存储 

