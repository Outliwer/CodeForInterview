public class Solution {
    /*
     * @param x: the base number
     * @param n: the power number
     * @return: the result
     */
    public double myPow(double x, int n) {
        // write your code here
        switch (n) {
            case 0:
                return 1;
            case 1:
                return x;
            case -1:
                return 1/x;
            case Integer.MIN_VALUE:
                return 0;
        }
        int index = getMaxTwo(n);
        return myPow(x,index / 2)*myPow(x,index / 2) * myPow(x,n-index);
    }
    
    public int getMaxTwo(int n){
        int index = n > 0 ? 1 : - 1;
        if (n / 2 != 0){
            index *= 2;
        }
        return index;
    }
}