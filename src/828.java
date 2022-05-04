public class Solution {
    /**
     * @param pattern: a string, denote pattern string
     * @param str: a string, denote matching string
     * @return: an boolean, denote whether the pattern string and the matching string match or not
     */
    public boolean wordPattern(String pattern, String str) {
        // write your code here
        HashMap<Character,String> patternMap = new HashMap<Character,String>();
        Set<String> hashSet = new HashSet<String>();
        String[] helper = str.split(" ");
        if (helper.length != pattern.length()) return false;
        for (int i = 0; i < pattern.length(); i++) {
            if (patternMap.get(pattern.charAt(i)) == null){
                patternMap.put(pattern.charAt(i),helper[i]);
                if (hashSet.contains(helper[i]))
                    return false;
                hashSet.add(helper[i]);
            } else if (patternMap.get(pattern.charAt(i)).equals(helper[i])){
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}