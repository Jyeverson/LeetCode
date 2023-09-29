package JAVA;

public class TruncateSentence {

    public String truncateSentence(String s, int k) {
        String[] arrOfStr = s.split(" ");
        StringBuilder rtr = new StringBuilder();

        if (k >= arrOfStr.length) {
            return s;
        }

        for(int i = 0; i < k; i++){
            rtr.append(arrOfStr[i]);
            if (i < k - 1) {
                rtr.append(" ");
            }
        }

        return rtr.toString();
    }

}