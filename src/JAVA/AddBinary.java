package JAVA;

public class AddBinary {
    public String addBinary(String a, String b) {

        int number0 = Integer.parseInt(a, 2);
        int number1 = Integer.parseInt(b, 2);

        return Integer.toBinaryString(number0 + number1);
    }
}
