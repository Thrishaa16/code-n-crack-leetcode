class Solution {
    public int fib(int n) {
        if(n <= 1) return n;

        //Using DP(Memorization)

        // int [] memo = new int[n+1];
        // if(n<=1)return n;

        // if(memo[n]!=0)
        //     return memo[n];
        // memo[n] = fib(n-1)+fib(n-2);
        // return memo[n];


        // Using DP(Tabluation)
        int[] dp = new int [n+1];
        dp[0]=0;
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];

        //    Using recursion

    //   if(n==0 || n==1)
    //         return n;
    //    else{
    //         return fib(n-1)+fib(n-2);
    }
}