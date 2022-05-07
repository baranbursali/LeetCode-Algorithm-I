import java.util.List;

public class Triangle {

    // https://leetcode.com/problems/triangle/
    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] min = new int[triangle.size()][triangle.size()];
        if (triangle.size() == 1) return triangle.get(0).get(0);
        if (triangle.size() == 2)
            return triangle.get(0).get(0) + Math.min(triangle.get(1).get(0), triangle.get(1).get(1));

        min[0][0] = triangle.get(0).get(0);
        min[1][0] = min[0][0] + triangle.get(1).get(0);
        min[1][1] = min[0][0] + triangle.get(1).get(1);

        for (int i = 2; i < triangle.size(); i++) {
            List<Integer> l = triangle.get(i);
            min[i][0] = l.get(0) + min[i - 1][0];
            for (int j = 1; j < l.size() - 1; j++) {
                min[i][j] = l.get(j) + Math.min(min[i - 1][j - 1], min[i - 1][j]);
            }
            min[i][l.size() - 1] = l.get(l.size() - 1) + min[i - 1][l.size() - 2];
        }

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < min.length; i++) {
            ans = Math.min(ans, min[triangle.size() - 1][i]);
        }

        return ans;
    }
}
