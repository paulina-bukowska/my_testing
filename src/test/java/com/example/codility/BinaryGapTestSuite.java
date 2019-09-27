package com.example.codility;

import org.junit.Assert;
import org.junit.Test;

public class BinaryGapTestSuite {
    @Test
    public void testBinaryGap() {
        //Given
        BinaryGap gap = new BinaryGap();

        //When
        int gap1 = gap.solution(320);
        int gap2 = gap.solution(418);
        int gap3 = gap.solution(9);
        int gap4 = gap.solution(529);
        int gap5 = gap.solution(20);
        int gap6 = gap.solution(137216);
        int gap7 = gap.solution(176);
        int gap8 = gap.solution(1041);
        int gap9 = gap.solution(15);

        //Then
        Assert.assertEquals(1, gap1);
        Assert.assertEquals(3, gap2);
        Assert.assertEquals(2, gap3);
        Assert.assertEquals(4, gap4);
        Assert.assertEquals(1, gap5);
        Assert.assertEquals(4, gap6);
        Assert.assertEquals(1, gap7);
        Assert.assertEquals(5, gap8);
        Assert.assertEquals(0, gap9);
    }
}
