import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Combinations {
    List<List<Integer>> ans = new ArrayList<>();
    Stack<Integer> stack = new Stack<>();
    int n;
    int k;

    // https://leetcode.com/problems/combinations/
    public List<List<Integer>> combine(int n, int k) {
        this.n = n;
        this.k = k;
        combinationHelper(1);
        return ans;
    }

    void combinationHelper(int l) {
        if (stack.size() == k) {
            ans.add((List<Integer>) stack.clone());
            return;
        } else {
            // limit is optimized
            for (int i = l; i <= n - (k - stack.size()) + 1; i++) {
                stack.push(i);
                combinationHelper(i + 1);
                stack.pop();
            }
        }
    }
}
