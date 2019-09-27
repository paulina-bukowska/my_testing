package com.example.codewars;

import org.junit.Assert;
import org.junit.Test;
import java.util.HashSet;

public class PermutationsTestSuite {
    Permutations permutations = new Permutations();

    @Test
    public void testGetPermutations() {
        //Given
        String first = "a";
        String second = "ab";
        String third = "abc";
        String fourth = "abab";
        String fifth = "abrakadabra";

        //When
        HashSet<String> permutationFirst = permutations.getPermutations(first);
        HashSet<String> permutationSecond = permutations.getPermutations(second);
        HashSet<String> permutationThird = permutations.getPermutations(third);
        HashSet<String> permutationFourth = permutations.getPermutations(fourth);
        HashSet<String> permutationFifth = permutations.getPermutations(fifth);

        //Then
        Assert.assertEquals(1, permutationFirst.size());
        Assert.assertEquals(2, permutationSecond.size());
//        Assert.assertEquals(6, permutationThird.size());
//        Assert.assertEquals(6, permutationFourth.size());
//        Assert.assertEquals(?, permutationFifth.size());
    }
}