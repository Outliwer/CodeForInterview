public class Solution {
    /**
     * @param nums: an array
     * @return: the minimum number of moves required to make all array elements equal
     */
    public int minMoves(int[] nums) {
        // Write your code here
        int sum = 0;
        int min = nums[0];
        for (int i = 0; i < nums.length; i ++){
            if (nums[i] < min){
                min = nums[i];
            }
            sum += nums[i];
        }
        return sum - min * nums.length;
    }
}