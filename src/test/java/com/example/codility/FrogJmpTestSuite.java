package com.example.codility;

import org.junit.Assert;
import org.junit.Test;

public class FrogJmpTestSuite {
    @Test
    public void testFrogJmpWithSolution() {
        // Given
        FrogJmp frogJmp = new FrogJmp();

        // When
        int numOfJmp = frogJmp.solution(10, 85, 30);
        int numOfJmp2 = frogJmp.solution(85, 85, 30);
        int numOfJmp3 = frogJmp.solution(10, 90, 10);

        // Then
        Assert.assertEquals(3, numOfJmp);
        Assert.assertEquals(0, numOfJmp2);
        Assert.assertEquals(8, numOfJmp3);
    }

    @Test
    public void testFrogJmpWithBetterSolution() {
        // Given
        FrogJmp frogJmp = new FrogJmp();

        // When
        int numOfJmp = frogJmp.betterSolution(10, 85, 30);
        int numOfJmp2 = frogJmp.betterSolution(85, 85, 30);
        int numOfJmp3 = frogJmp.betterSolution(10, 90, 10);

        // Then
        Assert.assertEquals(3, numOfJmp);
        Assert.assertEquals(0, numOfJmp2);
        Assert.assertEquals(8, numOfJmp3);
    }
}