public class Solution {
    /**
     * @param numbers: Give an array numbers of n integer
     * @return: Find all unique triplets in the array which gives the sum of zero.
     */
    public List<List<Integer>> threeSum(int[] numbers) {
        // write your code here
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(numbers);
        int length = numbers.length;
        for (int i = 0; i < length - 2;i ++ ){
            if (i > 0 && numbers[i] == numbers[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = length - 1;
            finTwoSum(results,-numbers[i],left,right,numbers,i);
        } 
        return results;
    }
    
    public void finTwoSum(List<List<Integer>> results,int index,int left, int right,int[] numbers,int current){
        while(left < right){
            if (numbers[left] + numbers[right] == index){
                List<Integer> temp = new ArrayList<>();
                temp.add(numbers[current]);
                temp.add(numbers[left]);
                temp.add(numbers[right]);
                results.add(temp);
                
                right --;
                left ++;
                
                while (left < right && numbers[left] == numbers[left - 1]){
                    left++;
                }
                while (left < right && numbers[right] == numbers[right + 1]) {
                    right--;
                }
            } else if(left < right &&  numbers[left] + numbers[right] < index){
                left ++;
            } else {
                right --;
            }
            
        }
    }
}