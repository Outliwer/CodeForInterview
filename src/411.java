public class Solution {
    /**
     * @param n: a number
     * @return: Gray code
     */
    public List<Integer> grayCode(int n) {
        // write your code here
        int size = 1 << n;
        
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int i = 0; i < size; i++) {
            int grayCode = i ^ i >> 1;
            res.add(grayCode);
        }
        return res;

    }
}