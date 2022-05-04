public class Solution {
    /*
     * @param nums: a list of integers
     * @return: The majority number that occurs more than 1/3
     */
    public int majorityNumber(List<Integer> nums) {
        // write your code here
        // Map<Integer,Integer> Helper = new HashMap<Integer,Integer>();
        // for (int i = 0;i < nums.size();i++){
        //     if (Helper.get(nums.get(i)) == null){
        //         Helper.put(nums.get(i),1);
        //     } else {
        //         Helper.put(nums.get(i),Helper.get(nums.get(i)) + 1);
        //     }
        // }
        // for (Map.Entry<Integer, Integer> entry : Helper.entrySet()) {
        //     if (entry.getValue() > nums.size() / 3 )
        //         return entry.getKey();
        // }
        // return -1;
        if(nums.size()==1) {
            return nums.get(0);
        }

        int m1 = nums.get(0);
        int m2 = 0;

        int c1 = 1;
        int c2 = 0;

        for(int i=1; i<nums.size(); i++) {
            int x = nums.get(i);
            if(x==m1) ++c1;
            else if(x==m2) ++c2;
            else if(c1==0) {
                m1 = x;
                c1 = 1;
            } else if(c2==0) {
                m2 = x;
                c2 = 1;
            } else {
                --c1; --c2;
            }
        }
        c1 = 0; c2 = 0;
        for(int i=0; i<nums.size(); i++) {
            if(m1 == nums.get(i)) ++c1;
            else if(m2 == nums.get(i)) ++c2;
        }
        if(c1>nums.size()/3) return m1;
        if(c2>nums.size()/3) return m2;
        return -1;
    }
}