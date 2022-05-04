public class Solution {
    /*
     * @param A: An integer array
     * @param B: An integer array
     * @return: a double whose format is *.5 or *.0
     */
    public double findMedianSortedArrays(int[] A, int[] B) {
        // write your code here
        int n = A.length;
        int m = B.length;
        int index_A = 0;
        int index_B = 0;
        int index = 0;
        int temp = 0;
        int dead = (m + n) / 2 + (m + n) % 2;
        while(index != dead) {
            if (index_B >= m || (index_A < n && B[index_B] > A[index_A]) ){
                index_A ++;
                index ++;
                temp = A[index_A - 1];
            } else {
                index_B ++;
                index ++;
                temp = B[index_B - 1];
            }
        }
        if ((m + n) % 2 == 1) return (double)temp;
        if (index_A == n){
            return (double) (temp + B[index_B]) / 2 ;
        } else if (index_B == m){
            return (double) (temp + A[index_A]) / 2 ;
        } else {
            return (double) (temp + Math.min(A[index_A],B[index_B])) / 2;
        }
    }
}