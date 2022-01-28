public class FirstBadVersion {

    // https://leetcode.com/problems/first-bad-version/
    public int firstBadVersion(int n) {
        int i = 1;
        int j = n;
        int ans = n;
        while (i <= j) {
            int ind = j + (i - j) / 2;
            if (isBadVersion(ind)) {
                j = ind - 1;
                ans = ind;
            } else {
                i = ind + 1;
            }
        }
        return ans;
    }
}
