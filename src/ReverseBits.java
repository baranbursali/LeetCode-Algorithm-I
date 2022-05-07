public class ReverseBits {

    // https://leetcode.com/problems/reverse-bits/
    public int reverseBits(int n) {
        int ans = 0;

        for (int i = 0; i < 32; i++) {
            // mask
            int bit = (n >> i) & 1;
            // merge
            ans |= bit << (31 - i);
        }
        return ans;
    }
}
