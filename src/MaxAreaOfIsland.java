public class MaxAreaOfIsland {
    int ans = 0;
    int ansInside = 0;

    // https://leetcode.com/problems/max-area-of-island/
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j] && grid[i][j] == 1) {
                    ansInside = 0;
                    dfs(visited, grid, i, j);
                    ans = Math.max(ans, ansInside);
                }
            }
        }
        return ans;
    }

    void dfs(boolean[][] visited, int[][] grid, int px, int py) {
        if (py < 0 || py > grid[0].length - 1 || px < 0
                || px > grid.length - 1 || grid[px][py] == 0 || visited[px][py]) {
            return;
        }

        visited[px][py] = true;
        ansInside++;
        dfs(visited, grid, px, py - 1);
        dfs(visited, grid, px, py + 1);
        dfs(visited, grid, px - 1, py);
        dfs(visited, grid, px + 1, py);
    }

}
