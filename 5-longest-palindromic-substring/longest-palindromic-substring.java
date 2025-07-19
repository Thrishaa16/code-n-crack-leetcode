class Solution {
    public String longestPalindrome(String s) {
       StringBuilder s2=new StringBuilder(s);
       s2.reverse();
       int start=0;
       int[][] dp=new int[s.length()][s2.length()];
        int maxLength=0,end=-1;
        int n=s.length();
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s2.length();j++){
                if(s.charAt(i)==s2.charAt(j)){
                    if(i==0 || j==0){
                        dp[i][j]=1;
                    }
                    else{
                        dp[i][j]=dp[i-1][j-1]+1;
                    }
                    start=i-dp[i][j]+1;
                    if(dp[i][j]>maxLength && start==n-1-j){
                        maxLength=dp[i][j];
                        end=i;
                    }
                }
            }
        }
        start=end-maxLength+1;
        return s.substring(start,end+1);  
    }
}


