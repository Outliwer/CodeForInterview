public class Solution {
    /**
     * @param nums: A set of numbers
     * @return: A list of lists
     */
    //  public List<List<Integer>> subsets(int[] nums) {
    //     // write your code here
    //     List<List<Integer>> ans = new ArrayList<List<Integer>>();
    //     List<Integer> temp = new ArrayList<Integer>();
    //     Arrays.sort(nums);
    //     helper(ans,0,nums,temp); 
    //     return ans;
    // }
    
    // private void helper(List<List<Integer>> ans,int index,int[] nums,List<Integer> temp){
    //     if (index == nums.length){
    //         ans.add(new ArrayList<Integer>(temp));
    //         return;
    //     }
    //     helper(ans,index+1,nums,temp);
        
    //     temp.add(nums[index]);
    //     helper(ans,index+1,nums,temp);
    //     temp.remove(temp.size()-1);
    // }
    public List<List<Integer>> subsets(int[] nums) {
        // write your code here
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        for (int i = 0; i < (1 << n);i ++){
            List<Integer> temp = new ArrayList<Integer>();
            //相当于寻找哪一位上为1
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0){
                    temp.add(nums[j]);
                }
            }
            ans.add(temp);
        }
        return ans;
    }
}