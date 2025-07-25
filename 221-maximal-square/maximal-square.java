class Solution {
    public int maximalSquare(char[][] matrix) {
        int maxSide =0;
        int rows = matrix.length,cols = matrix[0].length;
        int[][] dp = new int[rows][cols];
        for(int i =0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]=='1'){
                    if(i==0 || j==0)
                        dp[i][j]=1;
                    else
                        dp[i][j] = 1+Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1]);
                    if(dp[i][j]>maxSide)
                        maxSide = dp[i][j];
                }
            }
        }
        return maxSide*maxSide;
    }
}