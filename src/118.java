public class Solution {
    /*
     * @param : A string
     * @param : A string
     * @return: Count the number of distinct subsequences
     */
    public int numDistinct(String S, String T) {
        // write your code here
        int[] dp = new int[T.length()+1];
        //无论如何当T为"" 都会有一个子序列
        dp[0] = 1;
        for (int i = 0; i < S.length() ; i ++){
            for (int j = T.length() ; j > 0; j --){
                // dp[j] = dp[i][j] 
                //F(i,j) = F(i-1,j-1) + F(i-1,j)  可以等价于
                //dp[j] = dp[j-1] + dp[j]  对于纵向的 i -> i - 1 因为一直只有这种变化
                //因此可以用循环代替
                dp[j] += T.charAt(j-1)==S.charAt(i)?dp[j-1]:0;
            }
        } 
        return dp[T.length()];
    }
};