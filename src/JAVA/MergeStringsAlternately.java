package JAVA;

public class MergeStringsAlternately {

    public String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();

        int length1 = word1.length();
        int length2 = word2.length();
        int maxLength = Math.max(length1, length2);

        for (int i = 0; i < maxLength; i++) {
            if (i < length1) {
                merged.append(word1.charAt(i));
            }
            if (i < length2) {
                merged.append(word2.charAt(i));
            }
        }

        return merged.toString();
    }

}