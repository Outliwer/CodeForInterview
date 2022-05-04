public class Solution {
    /**
     * @param nums: a list of integers
     * @return: return a integer
     */
    public int singleNonDuplicate(int[] nums) {
        // write your code here
        int low = 0;
        int high = nums.length - 1;
        while (low < high){
            int middle = (low + high) / 2;
            if (nums[middle] != nums[middle - 1] && nums[middle] != nums[middle+1])
                return nums[middle];
            else {
                if (nums[middle] == nums[middle - 1]){
                    if ((middle - 1 - low)%2 == 1){
                        high = middle - 2;
                    } else {
                        low = middle + 1;
                    }
                } else {
                    if ((high - middle - 1)%2 == 1){
                        low = middle + 2;
                    } else {
                        high = middle - 1;
                    }
                }
            }
            if (low == high)
                return nums[low];
        }
        return nums[0];
    }
}