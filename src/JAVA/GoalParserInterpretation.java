package JAVA;

public class GoalParserInterpretation {

    public String interpret(String command) {
        StringBuilder interpretation = new StringBuilder();
        int index = 0;

        while (index < command.length()) {
            char currentChar = command.charAt(index);

            if (currentChar == 'G') {
                interpretation.append('G');
                index++;
            } else if (currentChar == '(' && command.charAt(index + 1) == ')') {
                interpretation.append('o');
                index += 2;
            } else if (currentChar == '(' && command.charAt(index + 1) == 'a') {
                interpretation.append("al");
                index += 4;
            }
        }

        return interpretation.toString();
    }

}