package com.datastructure.datastructure.sort;

import com.datastructure.datastructure.helper.SortArrayHelper;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BubbleSortTest {

    @Test
    public void sort() {
        int[] result = BubbleSort.sort(SortArrayHelper.getUnsortedNumbers());
        assertArrayEquals(SortArrayHelper.getSortedNumbers(), result);
    }

    @Test
    public void sortEnhanced() {
        int[] result = BubbleSort.sortEnhanced(SortArrayHelper.getUnsortedNumbers());
        assertArrayEquals(SortArrayHelper.getSortedNumbers(), result);
    }
}