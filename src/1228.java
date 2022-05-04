public class Solution {
    /**
     * @param buckets: an integer
     * @param minutesToDie: an integer
     * @param minutesToTest: an integer
     * @return: how many pigs you need to figure out the "poison" bucket within p minutes 
     */
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        // Write your code here
        if (minutesToTest < minutesToDie)
            return -1;
        int index = (minutesToTest / minutesToDie) + 1;
        int temp = 1;
        int ans = 0;
        while(temp < buckets){
            ans ++;
            temp *= index;
        }
        return ans;
        
    }
}