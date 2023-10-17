package JAVA;

public class DeleteColumnsToMakeSorted {
    public int minDeletionSize(String[] strs) {
        int n = strs[0].length();
        int count = 0;

        for (int col = 0; col < n; col++) {
            for (int row = 1; row < strs.length; row++) {
                if (strs[row].charAt(col) < strs[row - 1].charAt(col)) {
                    count++;
                    break;
                }
            }
        }

        return count;
    }
}
