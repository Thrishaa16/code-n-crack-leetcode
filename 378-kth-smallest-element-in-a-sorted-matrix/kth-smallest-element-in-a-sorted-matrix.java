class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int r = matrix.length;
        int c = matrix[0].length;
        int ans[] = new int[r*c];
        int b=0;
        for(int i =0 ;i<r;i++){
            for(int j=0;j<c;j++){
                ans[b++]=matrix[i][j];
            }
        }
        Arrays.sort(ans);
        return ans[k-1];
    }
}