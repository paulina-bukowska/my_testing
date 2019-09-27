package com.example.codility;

import java.util.HashSet;
import java.util.Set;

// Find the earliest time when a frog can jump to the other side of a river
public class FrogRiverOne {
    public int solution(int X, int[] A) {
        Set<Integer> uniqueNum = new HashSet<>();
        int sec = -1;

        for (int num : A) {
            uniqueNum.add(num);
        }

        if (uniqueNum.size() != X) {
            return sec;
        }

        for (int i = 0; i < A.length; i++) {
            if (uniqueNum.contains(A[i])) {
                uniqueNum.remove(A[i]);
            }
            if (uniqueNum.isEmpty()) {
                return sec = i;
            }
        }

        return sec;
    }
}