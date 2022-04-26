public class FloodFill {
    int val;
    int newColor;

    // https://leetcode.com/problems/flood-fill/
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        this.val = image[sr][sc];
        this.newColor = newColor;
        // boolean[][] visited = new boolean[m][n];
        dfs(image, sr, sc);

        return image;
    }

    // 0 - 1ms
    void dfs(int[][] image, int px, int py) {
        if (py < 0 || py > image[0].length - 1 || px < 0 || px > image.length - 1
                || image[px][py] == newColor || image[px][py] != val) {
            return;
        }

        image[px][py] = newColor;
        dfs(image, px, py - 1);
        dfs(image, px, py + 1);
        dfs(image, px - 1, py);
        dfs(image, px + 1, py);
    }
    // 1 - 2ms
/*  void dfs(int[][] image, int px, int py) {
        if (image[px][py] != newColor) {
            image[px][py] = newColor;
            if (py > 0 && image[px][py - 1] == val) {
                dfs(image, px, py - 1);
            }
            if (py < image[0].length - 1 && image[px][py + 1] == val) {
                dfs(image, px, py + 1);
            }
            if (px > 0 && image[px - 1][py] == val) {
                dfs(image, px - 1, py);
            }
            if (px < image.length - 1 && image[px + 1][py] == val) {
                dfs(image, px + 1, py);
            }
        }
    }*/
}
