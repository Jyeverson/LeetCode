package JAVA;

public class CheckIfTheSentenceIsPangram {
    public boolean checkIfPangram(String sentence) {
        sentence = sentence.toLowerCase();

        boolean[] alphabetPresent = new boolean[26];

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if ('a' <= ch && ch <= 'z') {
                alphabetPresent[ch - 'a'] = true;
            }
        }

        for (boolean present : alphabetPresent) {
            if (!present) {
                return false;
            }
        }

        return true;
    }
}
