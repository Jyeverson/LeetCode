package JAVA;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        char[] sArray = s.toLowerCase().toCharArray();
        char[] tArray = t.toLowerCase().toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);
    }
}
