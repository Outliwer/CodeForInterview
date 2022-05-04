public class Solution {
    /**
     * @param n: n pairs
     * @return: All combinations of well-formed parentheses
     */
    public List<String> generateParenthesis(int n) {
        // write your code here
        List<String> results = new ArrayList<>();
        getParent(n,n,results,"");
        return results;
    }

    public void getParent(int left,int right,List<String> results,String index){
        if (left == 0 && right == 0){
            results.add(index);
            return;
        }
        if (left > 0){
            String tempLeft = index + "(";
            getParent(left-1,right,results,tempLeft);
        }
        if (right > left){
            String tempRight = index + ")";
            getParent(left,right-1,results,tempRight);
        }
    }
}