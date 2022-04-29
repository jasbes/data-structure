package com.datastructure.datastructure.sort;

import com.datastructure.datastructure.helper.SortArrayHelper;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/*
 * Selection sort is conceptually the most simplest sorting algorithm.
 * This algorithm will first find the smallest element in the array and swap it with the element in the first position,
 * then it will find the second smallest element and swap it with the element in the second position,
 * and it will keep on doing this until the entire array is sorted.
 * It is called selection sort because it repeatedly selects the next-smallest element and swaps it into the right place.
 *
 * Worst Case Time Complexity [ Big-O ]: O(n2)
 * Best Case Time Complexity [Big-omega]: O(n2)
 * Average Time Complexity [Big-theta]: O(n2)
 * Space Complexity: O(1)
 *
 * Go to https://www.studytonight.com/data-structures/selection-sorting
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SelectionSort {

    public static int[] sort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int smallestIndex = SortArrayHelper.findSmallestIndex(nums, i);
            SortArrayHelper.switchPositions(nums, i, smallestIndex);
        }

        return nums;
    }
}
