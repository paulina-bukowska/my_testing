package com.example.devskiller;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HighestValueIndexTestSuite {
    private HighestValueIndex warmup;

    @Before
    public void testSetup() throws Exception {
        warmup = new HighestValueIndex();
    }

    @Test
    public void findMaxFromTaskDescription() throws Exception {
        //given
        final int[] array = {1, 2, 3, 0, -1};

        //when
        int result = warmup.findMax(array);

        //then
        assertEquals(2, result);
    }

    @Test
    public void shouldFetchMinusZero() throws Exception {
        //given
        final int[] array = {};

        //when
        int result = warmup.findMax(array);

        //then
        assertEquals(-1, result);
    }

    @Test
    public void findMaxFromTaskDescription2() throws Exception {
        //given
        final int[] array = {1, 4, 4, 4, 3};

        //when
        int result = warmup.findMax(array);

        //then
        assertEquals(1, result);
    }
}
