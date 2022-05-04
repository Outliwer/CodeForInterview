public class Solution {
    /**
     * @param n: An integer
     * @return: An integer
     */
    public int numTrees(int n) {
        // write your code here
        if (n == 0)
        return 1;
        int[] Dj = new int[n+1];
        int ans = 0;
        Dj[0] = 1;
        for (int i = 1; i <= n ;i ++ ){
            Dj[i] = 0;
            for (int j = 1; j <= i; j ++){
                Dj[i] += Dj[i-j]*Dj[j-1];
            }
        } 
        return Dj[n];
    }
}