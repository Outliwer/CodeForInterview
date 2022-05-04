public class Solution {
    /**
     * @param n: a integer
     * @return: return a integer
     */
    public int trailingZeroes(int n) {
        // write your code here
        return  n < 5 ? 0 :trailingZeroes(n/5) + n/5;
    }
}