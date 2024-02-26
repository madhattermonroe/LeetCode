package com.github.madhattermonroe.leetcode;

/**
 * ArrayLection from LeetCode
 */
public class ArrayLection {

    /**
     * Given a binary array nums, return the maximum number of consecutive 1's in the array.
     *
     * @param nums an array with 0's and 1's
     * @return max number of consecutive 1's
     */
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxConesOnes = 0;
        int currentValue = 0;
        for (int num : nums) {
            if (num == 0) {
                currentValue = 0;
            } else {
                currentValue++;
            }

            if (currentValue > maxConesOnes) {
                maxConesOnes = currentValue;
            }
        }
        return maxConesOnes;
    }

    /**
     * Given an array nums of integers, return how many of them contain an even number of digits.
     *
     * @param nums an array with random int values
     * @return count of odd digit values
     */
    public int findNumbers(int[] nums) {
        int numberOfOddNumberDigits = 0;
        for (int num : nums) {
            if (num == 0) break;

            int length = 0;
            long temp = 1;

            while (temp <= num) {
                length++;
                temp *= 10;
            }

            if (length % 2 == 0) numberOfOddNumberDigits++;
        }

        return numberOfOddNumberDigits;
    }

    /**
     * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
     *
     * @param nums array of sorted nums from negative to positive
     * @return sorted array of doubled numbers from A array
     */
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        int index = n - 1;
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                res[index--] = nums[right] * nums[right];
                right--;
            } else {
                res[index--] = nums[left] * nums[left];
                left++;
            }
        }
        return res;
    }
}
