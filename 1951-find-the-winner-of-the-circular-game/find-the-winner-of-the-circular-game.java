class Solution {
    public int findTheWinner(int n, int k) {
        int ans = 0;

        for(int i=1;i<=n;i++)
            ans = (ans + k)%i;
        return ans+1; // Convert from 0-based to 1-based index
    }
}