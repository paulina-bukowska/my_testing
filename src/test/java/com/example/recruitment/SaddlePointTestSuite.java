package com.example.recruitment;

import org.junit.Assert;
import org.junit.Test;

public class SaddlePointTestSuite {
    SaddlePoint saddlePoint = new SaddlePoint();

    @Test
    public void testSolution() {
        // Given
        int[][]A = {{0,1,9,3},{7,5,8,3},{9,2,9,4},{4,6,7,1}};
        int[][]B = {{0,1,9,3,1},{7,5,8,3,1},{9,2,9,4,1},{4,6,7,1,1},{1,1,1,1,1}};
        int[][]C = {{8,2,4},{4,3,9},{6,1,4}};
        int[][]D = {{8,2,4},{1,3,9},{6,1,4}};
        int[][]E = {{8,2},{1,3},{6,1}};
        int[][]F = {};
        int[][]G = {{8,2,4,0,9,1},{4,3,9,0,3,0},{6,1,4,1,8,7},{2,3,9,3,6,4},{1,7,2,4,8,5}};

        // When
        int resultA = saddlePoint.solution(A);
        int resultB = saddlePoint.solution(B);
        int resultC = saddlePoint.solution(C);
        int resultD = saddlePoint.solution(D);
        int resultE = saddlePoint.solution(E);
        int resultF = saddlePoint.solution(F);
        int resultG = saddlePoint.solution(G);

        // Then
        Assert.assertEquals(2, resultA);
        Assert.assertEquals(2, resultB);
        Assert.assertEquals(1, resultC);
        Assert.assertEquals(0, resultD);
        Assert.assertEquals(0, resultE);
        Assert.assertEquals(0, resultF);
        Assert.assertEquals(4, resultG);
    }
}