public class TwoSumIInputArrayIsSorted {

    // https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];

        for (int i = 0; i < numbers.length; i++) {
            int searchRes = binarySearch(numbers, 0, numbers.length - 1, target - numbers[i]);
            if (searchRes != i && searchRes != -1) {
                ans[0] = Math.min(i + 1, searchRes + 1);
                ans[1] = Math.max(i + 1, searchRes + 1);
                break;
            }
        }
        return ans;
    }

    int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }
}
