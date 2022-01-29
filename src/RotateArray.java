public class RotateArray {

    // https://leetcode.com/problems/rotate-array/
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int prev = nums[0];
        int m = 0;
        if (k == 0) return;
        for (long i = 1; i < n + 1; i++) {
            long ind = (i * k + m) % n;
            int next = nums[(int) ind];
            nums[(int) ind] = prev;
            prev = next;
            if (((double) (i * k)) % n == 0) {
                m++;
                prev = nums[(int) ((ind + 1) % n)];
            }
        }
    }
}
