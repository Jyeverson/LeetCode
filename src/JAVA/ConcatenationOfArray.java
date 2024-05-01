package JAVA;

import java.util.Arrays;

public class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int[] newNums = Arrays.copyOf(nums, nums.length * 2);
        System.arraycopy(nums, 0, newNums, nums.length, nums.length);
        return newNums;
    }
}
