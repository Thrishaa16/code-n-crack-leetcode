class Solution {
    public void setZeroes(int[][] matrix) {
        Queue<int[]> que = new LinkedList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    que.offer(new int[]{i,j});
                }
            }
        }
        while(!que.isEmpty()){
            int[] data = que.poll();
            func(data[0],data[1],matrix);
        }
    }

    static void func(int r,int c,int matrix[][]){
        for(int i=0;i<matrix.length;i++)
            matrix[i][c] = 0;
        for(int j = 0;j<matrix[0].length;j++)
            matrix[r][j] = 0;
    }
}