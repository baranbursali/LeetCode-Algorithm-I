import java.util.*;
import java.util.stream.Stream;

public class ZeroOneMatrix {

    // https://leetcode.com/problems/01-matrix
    public int[][] updateMatrix(int[][] mat) {
        Queue<int[]> q = new LinkedList<>();
        int[][] dist = new int[mat.length][mat[0].length];
        Arrays.stream(dist).forEach(ints -> Arrays.fill(ints, Integer.MAX_VALUE));


        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 0) {
                    dist[i][j] = 0;
                    q.add(new int[]{i, j});
                }
            }
        }

        int[][] perm = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        while (!q.isEmpty()) {
            int[] l = q.poll();

            for (int i = 0; i < 4; i++) {
                int x = l[0] + perm[i][0];
                int y = l[1] + perm[i][1];
                int val = dist[l[0]][l[1]] + 1;

                if (x >= 0 && y >= 0 && x < mat.length && y < mat[0].length
                        && dist[x][y] > val) {
                    dist[x][y] = val;
                    q.add(new int[]{x, y});
                }
            }
        }

        return dist;
    }
}
