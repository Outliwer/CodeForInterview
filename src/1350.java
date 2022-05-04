public class Solution {
    /**
     * @param n: a integer
     * @return: return a string
     */
    public String convertToTitle(int n) {
        // write your code here
        String ans = "";
        String finalAns = "";
        while (n > 26){
            int index = n / 26;
            int temp = n % 26;
            ans += (char)(temp + 64);
            n = index;
        }
        ans += (char)(n + 64);
        for (int i = 0;i < ans.length(); i ++){
            finalAns += ans.charAt(ans.length() - 1 - i);
        } 
        return finalAns;
    }
}