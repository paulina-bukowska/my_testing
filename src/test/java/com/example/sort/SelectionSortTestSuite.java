package com.example.sort;

import com.example.sort.SelectionSort;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SelectionSortTestSuite {
    private SelectionSort selectionSort;

    @Before
    public void testSetup() throws Exception {
        selectionSort = new SelectionSort();
    }

    @Test
    public void testSelectionSort() {
        //Given
        int[] A = {5, 2, 8, 14, 1, 16};

        //When
        int[] sortedA = selectionSort.sort(A);

        //Then
        Assert.assertEquals(1, sortedA[0]);
        Assert.assertEquals(2, sortedA[1]);
        Assert.assertEquals(5, sortedA[2]);
        Assert.assertEquals(8, sortedA[3]);
        Assert.assertEquals(14, sortedA[4]);
        Assert.assertEquals(16, sortedA[5]);
    }
}
