public class SquaresofaSortedArray {

    // https://leetcode.com/problems/squares-of-a-sorted-array/
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int i = 0;
        int j = n - 1;
        while (i <= j) {
            if (Math.abs(nums[i]) < Math.abs(nums[j])) {
                ans[--n] = nums[j] * nums[j];
                j--;
            } else {
                ans[--n] = nums[i] * nums[i];
                i++;
            }
        }
        return ans;
    }
}
