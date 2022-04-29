package com.datastructure.datastructure.helper;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Arrays;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SortArrayHelper {
    private static final int[] UNSORTED_NUMBERS = {7, 6, 4, 3, 0, 9, 1, 8, 2, 5};
    private static final int[] SORTED_NUMBERS = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static int[] getSortedNumbers() {
        return Arrays.copyOf(SORTED_NUMBERS, SORTED_NUMBERS.length);
    }

    public static int[] getUnsortedNumbers() {
        return Arrays.copyOf(UNSORTED_NUMBERS, UNSORTED_NUMBERS.length);
    }

    public static void switchPositions(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

    public static int findSmallestIndex(int[] nums, int startIndex) {
        int smallest = startIndex;

        for (int i = startIndex; i < nums.length; i++) {
            if (nums[i] < nums[smallest]) {
                smallest = i;
            }
        }

        return smallest;
    }
}
