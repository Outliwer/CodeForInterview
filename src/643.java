public class Solution {
    /**
     * @param input: an abstract file system
     * @return: return the length of the longest absolute path to file
     */
    public int lengthLongestPath(String input) {
        // write your code here
        if (input == null || input.length() == 0) return 0;
        int[] lengths = new int[input.length() + 1];
        int ans = 0;
        for (String line : input.split("\n")) {
            int level = getLevel(line);
            int len = line.length() - level + 1;
            // 如果没有扩展文件
            if (line.contains(".")){
                ans = Math.max(ans,lengths[level - 1] + len);
            } else {
                lengths[level] = lengths[level - 1] + len + 1;
            }
        }
        return ans;
    }

    public int getLevel(String line){
        int index = 1;
        for(int i = 0; i < line.length(); i ++){
            if (line.charAt(i) != '\t'){
                return index;
            }
            index ++;
        }
        return index;
    }
}