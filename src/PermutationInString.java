import java.util.Arrays;

public class PermutationInString {

    // https://leetcode.com/problems/permutation-in-string/
    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        int[] s1Mapping = new int[26];

        for (char c : s1.toCharArray()) {
            s1Mapping[c - 'a']++;
        }

        int[] mapping = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            mapping[s2.charAt(i) - 'a']++;
        }

        if (Arrays.equals(s1Mapping, mapping)) {
            return true;
        }

        int i = s1.length();
        while (i < s2.length()) {
            mapping[s2.charAt(i) - 'a']++;
            mapping[s2.charAt(i - s1.length()) - 'a']--;
            i++;
            if (Arrays.equals(s1Mapping, mapping)) {
                return true;
            }
        }

        return false;
    }
}
