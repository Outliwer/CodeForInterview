public class Solution {

    /**
     * @param nums: the given array
     * @param k: the given number
     * @return:  whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Write your code here
        int length = nums.length;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i < length ;i ++ ){
            if (map.get(nums[i]) == null){
                map.put(nums[i],i);
                if (i > k)
                    map.remove(nums[i - k]);
            } else {
                if (i - map.get(nums[i]) <= k){
                    return true;
                }
                map.put(nums[i],i);
            }
        } 
        return false;
    }
}

public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Write your code here
        int length = nums.length;
        Set<Integer> map = new HashSet<Integer>();
        for (int i = 0; i < length ;i ++ ){
            if (!map.contains(nums[i])){
                map.add(nums[i]);
                if (i >= k)
                    map.remove(nums[i - k]);
            } else {
                return true;
            }
        } 
        return false;
    }