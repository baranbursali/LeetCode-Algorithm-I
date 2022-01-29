public class ReverseString {

    // https://leetcode.com/problems/reverse-string/
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;

        while (i < j) {
            char temp = s[j];
            s[j--] = s[i];
            s[i++] = temp;
        }
    }
}
