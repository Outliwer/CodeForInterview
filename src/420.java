public class Solution {
    /**
     * @param n: the nth
     * @return: the nth sequence
     */
    public String countAndSay(int n) {
        // write your code here
        if(n == 1)
            return "1";
        if(n == 2)
            return "11";
        String help = countAndSay(n - 1);
        String ans = "";
        int index = 0;
        for ( int i = 0;i < help.length() - 1 ;i++ ){
            if (help.charAt(i) == (help.charAt(i+1))){
                index ++;
            } else {
                index ++;
                ans += "" + index + help.charAt(i);
                index = 0;
            }
        } 
        if (help.charAt(help.length() - 1) == (help.charAt(help.length() - 2))){
            index ++;
            ans +=  "" + index + help.charAt(help.length()-1);
        } else {
            ans += "" + 1 + help.charAt(help.length()-1);
        }
        return ans;
    }
}