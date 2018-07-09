package com.example.codility;

import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;

public class MaxCountersTestSuite {
    MaxCounters maxCounters = new MaxCounters();

    @Test
    public void testMaxCounters1() {
        // Given
        int N = 5;
        int[] A = {3,4,4,6,1,4,4};

        int[] expectedResult = {3,2,2,4,2};

        // When
        int[] result = maxCounters.solution(N, A);

        // Then
        Assert.assertTrue(Arrays.equals(expectedResult, result));
    }

    @Test
    public void testMaxCounters2() {
        // Given
        int N = 3;
        int[] A = {1,2,3,4,5};

        int[] expectedResult = {1,1,1};

        // When
        int[] result = maxCounters.solution(N, A);

        // Then
        Assert.assertTrue(Arrays.equals(expectedResult, result));
    }
}