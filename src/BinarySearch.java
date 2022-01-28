public class BinarySearch {

    // https://leetcode.com/problems/binary-search/
    public int search(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            int ind = (i + j) / 2;
            if (nums[ind] == target) {
                return ind;
            } else if (nums[ind] > target) {
                j = ind - 1;
            } else {
                i = ind + 1;
            }
        }

        return -1;
    }
}
