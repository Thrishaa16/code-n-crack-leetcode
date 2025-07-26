class Solution {
    public void Zerodfs(int r, int c, char[][] grid) {

        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] != '1') {
            return;
        }

        grid[r][c] = '0';

        Zerodfs(r + 1, c, grid);
        Zerodfs(r - 1, c, grid);
        Zerodfs(r, c + 1, grid);
        Zerodfs(r, c - 1, grid);
    }

    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (grid[i][j] == '1') {
                    count++;
                    Zerodfs(i, j, grid); 
                }
            }
        }
        return count;
    }
}
