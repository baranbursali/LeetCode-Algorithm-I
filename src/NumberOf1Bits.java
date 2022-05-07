public class NumberOf1Bits {

    // https://leetcode.com/problems/number-of-1-bits/
    public int hammingWeight(int n) {
        int ans = 0;
        while (n != 0) {
            if (n < 0) ans++;
            n <<= 1;
        }
        return ans;
    }
}
