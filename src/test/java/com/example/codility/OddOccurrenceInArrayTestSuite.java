package com.example.codility;

import org.junit.Assert;
import org.junit.Test;

public class OddOccurrenceInArrayTestSuite {
    @Test
    public void testOddOccurrencesInArray() {
        //Given
        OddOccurrencesInArray odd = new OddOccurrencesInArray();
        int[] A = {9, 8, 9, 8, 3, 2, 2};
        int[] B = {9, 3, 9, 3, 9, 7, 9};
        int[] C = {9, 8, 3, 8, 3, 2, 2};

        //When
        int unpairedInA = odd.solution(A);
        int unpairedInB = odd.solution(B);
        int unpairedInC = odd.solution(C);

        //Then
        Assert.assertTrue(unpairedInA == 3);
        Assert.assertTrue(unpairedInB == 7);
        Assert.assertTrue(unpairedInC == 9);
    }
}
