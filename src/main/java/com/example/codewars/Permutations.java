package com.example.codewars;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashSet;

public class Permutations {
    public HashSet<String> getPermutations(String input) {
        HashSet<String> permutations = new HashSet<>();
        char[] chars = input.toCharArray();

        for(int i = 0; i < chars.length; i++) {
            for(int j = 0; j < chars.length; j++) {
                char[] charsClone = chars.clone();
                charsClone[i] = chars[j];
                charsClone[j] = chars[i];

                permutations.add(Arrays.toString(charsClone));
            }
        }
        return permutations;
    }

    private BigInteger getFactorial(int length) {
        BigInteger factorial = BigInteger.ONE;

        for(int i = 2; i <= length; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }
}