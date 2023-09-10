package JAVA;

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        String[] stringSplit = s.split(" ");
        return stringSplit[stringSplit.length - 1].length();
    }

}
