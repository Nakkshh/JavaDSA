package strings;
import java.util.*;
public class String017_AllValidAnagrams {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();

        if (s.length() < p.length()) {
            return result;
        }

        int[] freq = new int[26];

        // Frequency of characters in p
        for (char ch : p.toCharArray()) {
            freq[ch - 'a']++;
        }

        int left = 0;

        for (int right = 0; right < s.length(); right++) {

            // Add current character
            freq[s.charAt(right) - 'a']--;

            // Window size should not exceed p.length()
            if (right - left + 1 > p.length()) {
                freq[s.charAt(left) - 'a']++;
                left++;
            }

            // If window size == p.length(), check anagram
            if (right - left + 1 == p.length()) {

                boolean isAnagram = true;

                for (int count : freq) {
                    if (count != 0) {
                        isAnagram = false;
                        break;
                    }
                }

                if (isAnagram) {
                    result.add(left);
                }
            }
        }

        return result;
    }
}
