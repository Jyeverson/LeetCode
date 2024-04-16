package JAVA;

import java.util.HashMap;
import java.util.Map;

public class FindTheDifference {

    public static char findTheDifference(String s, String t) {
        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            int count = charCount.getOrDefault(c, 0);
            if (count == 0) {
                return c;
            } else {
                charCount.put(c, count - 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() > 0) {
                return entry.getKey();
            }
        }

        return '\0';
    }
}