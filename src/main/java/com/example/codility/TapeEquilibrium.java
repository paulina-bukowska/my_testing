package com.example.codility;

import java.util.Set;
import java.util.TreeSet;
import static java.lang.Math.abs;

// Minimize the value |(A[0] + ... + A[P-1]) - (A[P] + ... + A[N-1])|
public class TapeEquilibrium {
    // Time complexity O(N*N)
    public int solution(int[] A) {
        int firstPart = 0;
        int secondPart = 0;
        Set<Integer> differences = new TreeSet<>();

        for(int P = 1; P < A.length; P++) {
            for(int i = 0; i < P; i++) {
                firstPart = firstPart + A[i];
            }
            for(int i = P; i < A.length; i++) {
                secondPart = secondPart + A[i];
            }
            differences.add(abs(firstPart - secondPart));
            firstPart = 0;
            secondPart = 0;
        }
        return ((TreeSet<Integer>) differences).first();
    }
}