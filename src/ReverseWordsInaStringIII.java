public class ReverseWordsInaStringIII {

    // https://leetcode.com/problems/reverse-words-in-a-string-iii/
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();

        String[] sArr = s.split(" ");
        int i = 0;
        while (i < sArr.length) {
            String tmp = sArr[i];
            int l = tmp.length() - 1;
            while (l > -1) {
                ans.append(tmp.charAt(l--));
            }
            if (i != sArr.length - 1)
                ans.append(" ");
            i++;
        }
        return ans.toString();
    }
}
