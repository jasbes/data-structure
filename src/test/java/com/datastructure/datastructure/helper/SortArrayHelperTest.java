package com.datastructure.datastructure.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class SortArrayHelperTest {

    @Test
    public void findSmallestIndex() {
        int result = SortArrayHelper.findSmallestIndex(SortArrayHelper.getUnsortedNumbers(), 0);
        assertEquals(4, result);
    }
}