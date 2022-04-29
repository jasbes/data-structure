package com.datastructure.datastructure.sort;

import com.datastructure.datastructure.helper.SortArrayHelper;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/*
 * The bubble sort matches the human mental model of sorting pretty well.
 * The algorithm is pretty simple: compare two items in an array that are next to each other.
 * If they're out of order (that is, the larger one comes first in the array) swap them.
 * Then move forward one index, compare again, swap if needed, and continue to the next item in the array.
 * Once we've reached the end of the array, if we've swapped anything in the previous run through, the array could still be out of order, so we have to pass through again.
 * Once we run through the whole array with no swaps, the array is sorted!
 *
 * Worst Case Time Complexity [ Big-O ]: O(n2)
 * Best Case Time Complexity [Big-omega]: O(n)
 * Average Time Complexity [Big-theta]: O(n2)
 * Space Complexity: O(1)
 *
 * Go to https://btholt.github.io/complete-intro-to-computer-science/bubble-sort
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class BubbleSort {

    public static int[] sort(int[] nums) {
        boolean wasChanged;
        do {
            wasChanged = false;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    SortArrayHelper.switchPositions(nums, i, i + 1);
                    wasChanged = true;
                }
            }
        } while (wasChanged);
        return nums;
    }

    public static int[] sortEnhanced(int[] nums) {
        boolean wasChanged;
        int interactions = 0;
        do {
            wasChanged = false;
            interactions++;
            for (int i = 0; i < nums.length - interactions; i++) {
                if (nums[i] > nums[i + 1]) {
                    SortArrayHelper.switchPositions(nums, i, i + 1);
                    wasChanged = true;
                }
            }
        } while (wasChanged);
        return nums;
    }
}
