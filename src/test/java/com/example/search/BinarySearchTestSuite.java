package com.example.search;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTestSuite {

    @Test
    public void testBinarySearch() {
        //Given
        BinarySearch binarySearch = new BinarySearch();

        //When
        int[] A = {3, 8, 9, 7, 6};
        int num = 3;
        int index = binarySearch.binarySearch(A, num);

        //Then
        Assert.assertEquals(0, index);
    }

    @Test
    public void test2BinarySearch() {
        //Given
        BinarySearch binarySearch = new BinarySearch();

        //When
        int[] A = {35, 8, 12, 456, 13};
        int num = 3;
        int index = binarySearch.binarySearch(A, num);

        //Then
        Assert.assertEquals(-1, index);
    }

    @Test
    public void test3BinarySearch() {
        //Given
        BinarySearch binarySearch = new BinarySearch();

        //When
        int[] A = {35, 8, 12, 456, 13, 45, 27, 82, 90};
        int num = 82;
        int index = binarySearch.binarySearch(A, num);

        //Then
        Assert.assertEquals(7, index);
    }
}
