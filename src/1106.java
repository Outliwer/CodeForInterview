/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */

public class Solution {
    /**
     * @param nums: an array
     * @return: the maximum tree
     */
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        // Write your code here
        if (nums == null || nums.length == 0) return null;
        int n = nums.length;
        int maxValue = nums[0];
        int index = 0;
        for (int i = 0; i < n; i++){
            if(nums[i] > maxValue){
                index = i;
                maxValue = nums[i];
            }
        }
        TreeNode ans = new TreeNode(maxValue);
        int[] leftArray = new int[index];
        for (int i = 0 ; i < index; i ++){
            leftArray[i] = nums[i];
        }
        int[] rightArray = new int[n - index - 1];
        for (int i = 0; i < n - index - 1; i ++){
            rightArray[i] = nums[i + index + 1];
        }
        ans.left = constructMaximumBinaryTree(leftArray);
        ans.right = constructMaximumBinaryTree(rightArray);
        return ans;
    }
}