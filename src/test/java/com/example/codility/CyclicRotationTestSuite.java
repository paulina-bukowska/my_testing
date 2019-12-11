package com.example.codility;

import org.junit.Assert;
import org.junit.Test;

public class CyclicRotationTestSuite {@Test
public void testCyclicRotation() {
    //Given
    CyclicRotation rotation = new CyclicRotation();

    //When
    int[] A = {3, 8, 9, 7, 6};
    int K = 3;
    int[] rotatedA = rotation.solution(A, K);

    //Then
    Assert.assertEquals(9, rotatedA[0]);
    Assert.assertEquals(7, rotatedA[1]);
    Assert.assertEquals(6, rotatedA[2]);
    Assert.assertEquals(3, rotatedA[3]);
    Assert.assertEquals(8, rotatedA[4]);
}


    @Test
    public void shouldFetchUnrotatedTable() {
        //Given
        CyclicRotation rotation = new CyclicRotation();

        //When
        int[] A = {5, 2, 4, 3, 0, 2, 1};
        int K = 7;
        int[] rotatedA = rotation.solution(A, K);

        //Then
        Assert.assertEquals(7, rotatedA.length);
        Assert.assertTrue(A == rotatedA);
    }

    @Test
    public void testCyclicRotationWhenKIsZero() {
        //Given
        CyclicRotation rotation = new CyclicRotation();

        //When
        int[] A = {5, 2, 4, 3, 0, 2, 1};
        int K = 0;
        int[] rotatedA = rotation.solution(A, K);

        //Then
        Assert.assertEquals(7, rotatedA.length);
        Assert.assertTrue(A == rotatedA);
    }

    @Test
    public void testCyclicRotationWithEmptyA() {
        //Given
        CyclicRotation rotation = new CyclicRotation();

        //When
        int[] A = {};
        int K = 5;
        int[] rotatedA = rotation.solution(A, K);

        //Then
        Assert.assertEquals(0, rotatedA.length);
        Assert.assertTrue(A == rotatedA);
    }
}