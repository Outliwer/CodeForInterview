public class Solution {
    /**
     * @param start: 
     * @param end: 
     * @param bank: 
     * @return: the minimum number of mutations needed to mutate from "start" to "end"
     */
    public int minMutation(String start, String end, String[] bank) {
        Set<String> visited = new HashSet<>();
        int res=helper(start,end,bank,0,visited);
        if(res==Integer.MAX_VALUE)return -1;
        return res;
    }
    
    public int helper(String cur, String end, String[]bank, int index, Set<String> visited){
        if(cur.equals(end)){
            return index; 
        }
        visited.add(cur);
        int min=Integer.MAX_VALUE;
       
        for(int i=0; i<bank.length;++i){
            int diff=0;
            String curr=bank[i];
            for(int j=0; j<curr.length();++j){
                if(curr.charAt(j)!=cur.charAt(j))++diff;
                if(diff>1)break;
            }
            if(diff==1){
               if(!visited.contains(curr)){
            		visited.add(curr);
            		min=Math.min(min,helper(curr,end,bank,index+1,visited));
            		visited.remove(curr);
               }
            }
            
        }
        return min;
    }
}