class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans =0 ;
        int n=accounts.length;
        int m=accounts[0].length;
        int val = 0;
        for(int i=0;i<n;i++){
            val =0;
            for(int j=0;j<m;j++){
                val = val + accounts[i][j];
            }
            ans = Math.max(ans,val);
        }
        return ans;
    }
}