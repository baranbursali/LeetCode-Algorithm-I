public class SearchInsertPosition {

    // https://leetcode.com/problems/search-insert-position/
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        int ans = 0;
        while (i <= j) {
            int ind = j + (i - j) / 2;
            if (nums[ind] == target) {
                return ind;
            } else if (nums[ind] > target) {
                j = ind - 1;
                ans = ind;
            } else {
                i = ind + 1;
                ans = i;
            }
        }

        return ans;
    }
}
