package JAVA;

import java.util.Arrays;

public class SortingTheSentence {

    public String sortSentence(String s) {
        String[] stringSplit = s.split(" ");
        String[] result = new String[stringSplit.length];

        for (int i = 0; i < stringSplit.length; i++) {
            int indice = Integer.valueOf(stringSplit[i].substring(stringSplit[i].length() - 1));
            stringSplit[i] = stringSplit[i].substring(0, stringSplit[i].length() - 1);
            result[indice - 1] = stringSplit[i];
        }

        return String.join(" ", result);
    }

}