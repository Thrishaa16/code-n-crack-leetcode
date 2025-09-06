class Solution {
    public int[] countBits(int n){

        // Using DP
        if(n==0)
            return new int[]{0};
        if(n==1)
            return new int[]{0,1};
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        for(int i=3;i<=n;i++){
            dp[i] = dp[i/2]+i%2;
        }
        return dp;
    }




    /*public int[] countBits(int n) {
        int[] count = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            count[i] = countSetBits(i);
        }
        return count;
    }

    static int countSetBits(int n) {
        int cnt = 0;
        while (n > 0) {
            cnt += n % 2;
            n /= 2;
        }
        return cnt;
    }*/
}
