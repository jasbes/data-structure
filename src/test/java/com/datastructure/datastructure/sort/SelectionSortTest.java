package com.datastructure.datastructure.sort;

import com.datastructure.datastructure.helper.SortArrayHelper;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SelectionSortTest {

    @Test
    public void sort() {
        int[] result = SelectionSort.sort(SortArrayHelper.getUnsortedNumbers());
        assertArrayEquals(SortArrayHelper.getSortedNumbers(), result);
    }
}