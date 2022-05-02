import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {

    // https://leetcode.com/problems/letter-case-permutation
    public List<String> letterCasePermutation(String s) {
        List<String> l = new ArrayList<>();
        caller(l, s, new StringBuilder(), 0);
        return l;
    }

    void caller(List<String> l, String s, StringBuilder sb, int i) {
        for (int j = i; j < s.length(); ++j) {
            char c = s.charAt(j);

            if (c + 0 > 57) {
                sb.append(Character.toLowerCase(c));
                caller(l, s, sb, j + 1);
                sb.delete(j, sb.length());
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(c);
            }
        }
        l.add(sb.toString());
    }
}
