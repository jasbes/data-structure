package com.datastructure.datastructure.sort;

import com.datastructure.datastructure.helper.SortArrayHelper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class InsertionSortTest {

    @Test
    public void sort() {
        int[] result = InsertionSort.sort(SortArrayHelper.getUnsortedNumbers());
        assertArrayEquals(SortArrayHelper.getSortedNumbers(), result);
    }
}