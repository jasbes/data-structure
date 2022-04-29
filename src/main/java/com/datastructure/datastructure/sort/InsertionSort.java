package com.datastructure.datastructure.sort;

import com.datastructure.datastructure.helper.SortArrayHelper;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/*
 * Let's talk about a sort that is one that you will use occasionally in certain contexts, insertion sort.
 * With insertion sort, you treat the first part of your list as sorted and the second part of your list as unsorted.
 * Our algorithm will start by saying everything the 1 index (so just index 0, the first element) is sorted and everything after unsorted.
 * By definition a list of one is already sorted. From there, we start with the next element in the list (in this case, the 1 index, the second element) and loop backwards over our sorted list, asking "is the element that I'm looking to insert larger than what's here? If not, you work your way to the back of the array.
 * If you land at the first element of the sorted part of the list, what you have is smaller than everything else and you put it at the start.
 * You then repeat this until you've done it over the whole list!
 * The mechanism by which we'll do this is that we'll keep moving bigger elements to the right by swapping items in the array as we move across the element.
 * When we come to the place where we're going to insert, we'll stop doing those swaps
 *
 * Worst Case Time Complexity [ Big-O ]: O(n2)
 * Best Case Time Complexity [Big-omega]: O(n)
 * Average Time Complexity [Big-theta]: O(n2)
 * Space Complexity: O(1)
 *
 * Go to https://btholt.github.io/complete-intro-to-computer-science/insertion-sort
 *
 * Following are some of the important characteristics of Insertion Sort:
 * It is efficient for smaller data sets, but very inefficient for larger lists.
 * Insertion Sort is adaptive, that means it reduces its total number of steps if a partially sorted array is provided as input, making it efficient.
 * It is better than Selection Sort and Bubble Sort algorithms.
 * Its space complexity is less. Like bubble Sort, insertion sort also requires a single additional memory space.
 * It is a stable sorting technique, as it does not change the relative order of elements which are equal.
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class InsertionSort {

    public static int[] sort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int j = i;
            while (j > 0 && nums[j - 1] > nums[j]) {
                SortArrayHelper.switchPositions(nums, j - 1, j);
                j--;
            }
        }

        return nums;
    }
}
