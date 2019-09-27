package com.example.codility;

import org.junit.Assert;
import org.junit.Test;

public class PermCheckTestSuite {
    PermCheck permCheck = new PermCheck();

    @Test
    public void testPermCheck() {
        // Given
        int[] B = {4, 1, 3};
        int[] D = {1};
        int[] E = {1, 3};
        int[] F = {2, 5, 3, 6, 4, 1};
        int[] G = {2, 5, 5, 3, 5, 4, 1};
        int[] H = {2};

        //When
        int isPermB = permCheck.solution(B);
        int isPermD = permCheck.solution(D);
        int isPermE = permCheck.solution(E);
        int isPermF = permCheck.solution(F);
        int isPermG = permCheck.solution(G);
        int isPermH = permCheck.solution(H);

        //Then
        Assert.assertTrue(isPermB == 0);
        Assert.assertTrue(isPermD == 1);
        Assert.assertTrue(isPermE == 0);
        Assert.assertTrue(isPermF == 1);
        Assert.assertTrue(isPermG == 0);
        Assert.assertTrue(isPermH == 0);
    }
}