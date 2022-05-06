package com.datastructure.datastructure.sort;

import com.datastructure.datastructure.helper.SortArrayHelper;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

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
public class QuickSort {

    public static int[] sort(int[] nums) {
        quickSort(nums, 0, nums.length - 1);

        return nums;
    }

    private static void quickSort(int[] nums, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(nums, begin, end);

            quickSort(nums, begin, partitionIndex - 1);
            quickSort(nums, partitionIndex + 1, end);
        }
    }

    private static int partition(int[] nums, int begin, int end) {
        int pivot = nums[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (nums[j] <= pivot) {
                i++;
                SortArrayHelper.switchPositions(nums, i, j);
            }
        }

        SortArrayHelper.switchPositions(nums, i + 1, end);

        return i + 1;
    }
}
