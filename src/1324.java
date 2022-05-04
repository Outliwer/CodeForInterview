public class Solution {
    /**
     * @param n: a integer
     * @return: return a integer
     */
    public int countPrimes(int n) {
        // write your code here
        Boolean[] del = new Boolean[n];
        int ans = 0;
        for (int i = 3;i < n;i++){
            if(i % 2 == 0){
                del[i] = true;
            } else {
                del[i] = false;
            }
        } 
        for (int i = 3;i < n;i++){
            if(!del[i]){
            if(i*i>n)  break;
            for(int j=2; i*j<n; ++j)
                del[i*j] = true;
            }
        }
        for(int i=2; i<n; ++i)
        if(del[i] == null || !del[i])
            ++ans;
        return ans;
    }
}