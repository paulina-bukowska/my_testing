package com.example.recruitment;

import org.junit.Assert;
import org.junit.Test;

public class DemoTaskTestSuite {
    DemoTask demo = new DemoTask();

    @Test
    public void testDemoTask() {
        // Given
        int[] A = {-7, -5};
        int[] B = {-4, 1, 3};
        int[] C = {1};
        int[] D = {1, 2};
        int[] E = {2, 2, 2, 1, 1, 5};

        // When
        int resultA = demo.solution(A);
        int resultB = demo.solution(B);
        int resultC = demo.solution(C);
        int resultD = demo.solution(D);
        int resultE = demo.solution(E);

        //Then
        Assert.assertEquals(1,  resultA);
        Assert.assertEquals(2,  resultB);
        Assert.assertEquals(2,  resultC);
        Assert.assertEquals(3,  resultD);
        Assert.assertEquals(3,  resultE);
    }
}