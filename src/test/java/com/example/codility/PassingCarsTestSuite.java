package com.example.codility;

import org.junit.Assert;
import org.junit.Test;

public class PassingCarsTestSuite {
    PassingCars passingCars = new PassingCars();

    @Test
    public void testPassingCars() {
        //Given
        int[] A = {0,1,0,1,1};

        //When
        int pairsOfPassingCars = passingCars.solution(A);

        //Then
        Assert.assertEquals(5, pairsOfPassingCars);
    }
}