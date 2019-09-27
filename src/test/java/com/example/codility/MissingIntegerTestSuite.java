package com.example.codility;

import org.junit.Assert;
import org.junit.Test;

public class MissingIntegerTestSuite {
    MissingInteger missingInteger = new MissingInteger();

    @Test
    public void testMissingInteger() {
        // Given
        int[] B = {4, 1, 3};
        int[] D = {1};
        int[] E = {-1, -3};
        int[] F = {2, 5, 3, 6, 4, 1};
        int[] G = {5, 5, 3, 3, 1};

        //When
        int resultIntegerB = missingInteger.solution(B);
        int resultIntegerD = missingInteger.solution(D);
        int resultIntegerE = missingInteger.solution(E);
        int resultIntegerF = missingInteger.solution(F);
        int resultIntegerG = missingInteger.solution(G);

        //Then
        Assert.assertTrue(resultIntegerB == 2);
        Assert.assertTrue(resultIntegerD == 2);
        Assert.assertTrue(resultIntegerE == 1);
        Assert.assertTrue(resultIntegerF == 7);
        Assert.assertTrue(resultIntegerG == 2);
    }
}