package com.example.codility;

import org.junit.Assert;
import org.junit.Test;

public class TapeEquilibriumTestSuite {
    TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();

    @Test
    public void testTapeEquilibrium() {
        // Given
        int[] A = {7, 5, 1, 3, 6, 4};
        int[] B = {4, 1, 3};
        int[] E = {1, 3};
        int[] F = {2, 5, 3, 6, 4};
        int[] G = {2, 5, 1, 3, 6, 4};

        // When
        int minValueA = tapeEquilibrium.solution(A);
        int minValueB = tapeEquilibrium.solution(B);
        int minValueE = tapeEquilibrium.solution(E);
        int minValueF = tapeEquilibrium.solution(F);
        int minValueG = tapeEquilibrium.solution(G);

        // Then
        Assert.assertTrue(minValueA == 0);
        Assert.assertTrue(minValueB == 0);
        Assert.assertTrue(minValueE == 2);
        Assert.assertTrue(minValueF == 0);
        Assert.assertTrue(minValueG == 1);
    }
}
