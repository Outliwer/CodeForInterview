public class Solution {
    /**
     * @param s: the given string
     * @param numRows: the number of rows
     * @return: the string read line by line
     */
    public String convert(String s, int numRows) {
        // Write your code here
        if(numRows <= 1 || numRows > s.length())
            return s;
        String ans = "";
        for (int i = 0;i < numRows;i ++ ) {
            for (int j = i; j < s.length(); j = j + 2 * (numRows - 1)){
                ans += s.charAt(j);
                if (i != 0 && i != numRows - 1){
                    int index = j + 2*(numRows - i - 1);
                    if (index < s.length())
                        ans += s.charAt(index);
                } 
            }
        }
        return ans;
    }
}