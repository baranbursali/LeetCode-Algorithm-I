import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

    // https://leetcode.com/problems/longest-substring-without-repeating-characters/
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int localMax = 0;

        int i = 0;
        int j = 0;

        Map<Character, Integer> map = new HashMap<>();
        while (j < s.length()) {
            Integer ch = map.get(s.charAt(j));
            if (ch == null || ch < i) {
                map.put(s.charAt(j), j);
                localMax++;
                max = Math.max(max, localMax);
            } else {
                int tmp = ch;
                map.put(s.charAt(j), j);
                localMax -= Math.abs(tmp - i);
                i = tmp + 1;
            }
            j++;
        }

        return max;
    }
}
