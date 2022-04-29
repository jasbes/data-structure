package com.datastructure.datastructure.sort;

import com.datastructure.datastructure.helper.SortArrayHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@RunWith(MockitoJUnitRunner.class)
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