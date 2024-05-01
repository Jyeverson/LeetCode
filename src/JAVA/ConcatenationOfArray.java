package JAVA;

import java.util.Arrays;

public class ConcatenationOfArray {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(getConcatenation(new int[]{1, 2, 1})));
    }

    public static int[] getConcatenation(int[] nums) {

        int[] newNums = Arrays.copyOf(nums, nums.length * 2);
        System.arraycopy(nums, 0, newNums, nums.length, nums.length);
        return newNums;
    }

}
