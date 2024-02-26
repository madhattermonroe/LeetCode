package com.github.madhattermonroe.tips;

/**
 * Utility class on math topic
 * Collection of interesting ways of performing mathematical operations
 */
public class Mathematics {

    public Mathematics() {
        throw new IllegalArgumentException("Cannot create Utility class");
    }

    /**
     * Squaring array item value. Using for filling array of squared values from 0 to N.
     * Expected, that started item is 0 (means 1 - 0+1 * 0+1 = 1)
     *
     * @param value - from 0 to N
     * @return squared item value
     */
    public static int squaringIntInArrayByIndex(int value) {
        return (value + 1) * (value + 1);
    }

    /***
     * Get count of digits using log base 10
     * @param number value
     * @return count of digits of the value
     */
    public static int getCountOfIntDigitsLogarithmically(int number) {
        return (int) (Math.log10(number) + 1);
    }

    /***
     * Swaping two variables without introducing the third one
     * @param variables 2 variables to change as array
     * @return an array with swapped variables
     */
    public static int[] swapTwoIntVariables(int... variables) {
        if (variables.length > 2) {
            throw new ArrayIndexOutOfBoundsException("Max 2 variables");
        }
        int a = variables[0];
        int b = variables[1];
        a = a + b - (b = a);
        return new int[]{a, b};
    }

    /***
     * Finding two numbers that in sum return value of total variable
     * @param total sum of two numbers
     * @param nums array of numbers
     * @return two numbers that in sum return 'total' value
     */
    public static int[] twoSum(int total, int[] nums) {
        boolean[] previousValues = new boolean[5];

        for (int num : nums) {
            int complement = total - num;

            if (previousValues[complement]) {
                return new int[]{complement, num};
            }

            previousValues[num] = true;
        }
        return nums;
    }
}
