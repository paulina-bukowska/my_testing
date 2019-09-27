package com.example.codility;

import org.junit.Assert;
import org.junit.Test;

public class PermMissingElemTestSuite {
    @Test
    public void testPermMissingElem() {
        // Given
        PermMissingElem permMissingElem = new PermMissingElem();
        int[] A = {7, 5, 1, 3, 6, 4};
        int[] B = {4, 1, 3};
        int[] C = {};
        int[] D = {1};
        int[] E = {1, 3};
        int[] F = {2, 5, 3, 6, 4};
        int[] G = {2, 5, 1, 3, 6, 4};
        int[] H = {2};

        // When
        int missingA = permMissingElem.solution(A);
        int missingB = permMissingElem.solution(B);
        int missingC = permMissingElem.solution(C);
        int missingD = permMissingElem.solution(D);
        int missingE = permMissingElem.solution(E);
        int missingF = permMissingElem.solution(F);
        int missingG = permMissingElem.solution(G);
        int missingH = permMissingElem.solution(H);

        // Then
        Assert.assertTrue(missingA == 2);
        Assert.assertTrue(missingB == 2);
        Assert.assertTrue(missingC == 1);
        Assert.assertTrue(missingD == 2);
        Assert.assertTrue(missingE == 2);
        Assert.assertTrue(missingF == 1);
        Assert.assertTrue(missingG == 7);
        Assert.assertTrue(missingH == 1);
    }
}
