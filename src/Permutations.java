import java.util.ArrayList;
import java.util.List;

public class Permutations {
    List<List<Integer>> ans = new ArrayList<List<Integer>>();

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // https://leetcode.com/problems/permutations/
    public List<List<Integer>> permute(int[] nums) {
        permuteHelper(nums, 0, nums.length - 1);
        return ans;
    }

    int[] permuteHelper(int[] nums, int l, int r) {
        if (l == r) {
            List<Integer> list = new ArrayList<>();
            // Arrays.stream(nums).forEach(list::add); SLOW
            // List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList()); SLOW
            for (int k : nums) {
                list.add(k);
            }
            ans.add(list);
        } else {
            for (int i = l; i <= r; i++) {
                swap(nums, l, i);
                permuteHelper(nums, l + 1, r);
                swap(nums, l, i);
            }
        }
        return nums;
    }
}
