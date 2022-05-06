package com.datastructure.datastructure.sort;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Arrays;

/*
 * Merge Sort follows the rule of Divide and Conquer to sort a given set of numbers/elements,
 * recursively, hence consuming less time.
 *
 * Worst Case Time Complexity [ Big-O ]: O(n*log n)
 * Best Case Time Complexity [Big-omega]: O(n*log n)
 * Average Time Complexity [Big-theta]: O(n*log n)
 * Space Complexity: O(n)
 *
 * Go to https://btholt.github.io/complete-intro-to-computer-science/bubble-sort
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class MergeSort {

    public static int[] sort(int[] nums) {
        if (nums != null && nums.length == 1) {
            return nums;
        }

        int middle = nums.length / 2;

        int[] left = Arrays.copyOfRange(nums, 0, middle);
        int[] right = Arrays.copyOfRange(nums, middle, nums.length);

        return merge(sort(left), sort(right));
    }

    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int leftIndex = 0;
        int rightIndex = 0;
        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] < right[rightIndex]) {
                result[leftIndex + rightIndex] = left[leftIndex];
                leftIndex++;
            } else {
                result[leftIndex + rightIndex] = right[rightIndex];
                rightIndex++;
            }
        }

        while (leftIndex < left.length) {
            result[leftIndex + rightIndex] = left[leftIndex];
            leftIndex++;
        }

        while (rightIndex < right.length) {
            result[leftIndex + rightIndex] = right[rightIndex];
            rightIndex++;
        }

        return result;
    }
}
