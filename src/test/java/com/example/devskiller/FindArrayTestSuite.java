package com.example.devskiller;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindArrayTestSuite {
    private FindArray findArray;

    @Before
    public void testSetup() throws Exception {
        findArray = new FindArray();
    }

    @Test
    public void findArrayFromTaskDescription1() throws Exception {
        //given
        final int[] array = {4, 9, 3, 7, 8};
        final int[] subArray = {3, 7};

        //when
        int result = findArray.findArray(array, subArray);

        //then
        assertEquals(2, result);
    }

    @Test
    public void findArrayFromTaskDescription2() throws Exception {
        //given
        final int[] array = {4, 9, 3, 7, 8, 12, 3, 7};
        final int[] subArray = {3, 7};

        //when
        int result = findArray.findArray(array, subArray);

        //then
        assertEquals(6, result);
    }

    @Test
    public void findArrayFromTaskDescription3() throws Exception {
        //given
        final int[] array = {7, 8, 9};
        final int[] subArray = {8, 9, 10};

        //when
        int result = findArray.findArray(array, subArray);

        //then
        assertEquals(-1, result);
    }

    @Test
    public void findArrayFromTaskDescription4() throws Exception {
        //given
        final int[] array = {1, 3, 5};
        final int[] subArray = {1};

        //when
        int result = findArray.findArray(array, subArray);

        //then
        assertEquals(0, result);
    }

    @Test
    public void findArrayFromTaskDescription5() throws Exception {
        //given
        final int[] array = {1, 3, 5, 1};
        final int[] subArray = {1};

        //when
        int result = findArray.findArray(array, subArray);

        //then
        assertEquals(3, result);
    }

    @Test
    public void findArrayFromTaskDescription6() throws Exception {
        //given
        final int[] array = {9, 5, 1, 0, 0, 0, 8};
        final int[] subArray = {1, 0, 0};

        //when
        int result = findArray.findArray(array, subArray);

        //then
        assertEquals(2, result);
    }

    @Test
    public void findArrayFromTaskDescription7() throws Exception {
        //given
        final int[] array = {9, 5, 1, 0, 0, 0, 8};
        final int[] subArray = {};

        //when
        int result = findArray.findArray(array, subArray);

        //then
        assertEquals(-1, result);
    }
}