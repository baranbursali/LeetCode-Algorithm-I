public class MoveZeroes {

    // https://leetcode.com/problems/move-zeroes/
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 1;
        while (j < n) {
            if (nums[i] == 0 && nums[j] != 0) {
                nums[i++] = nums[j];
                nums[j++] = 0;
            } else if (nums[i] == 0 && nums[j] == 0) {
                j++;
            } else {
                i++;
                j++;
            }
        }
    }
}
