package com.example.codility;

import java.util.HashSet;
import java.util.Set;

// Check whether array A is a permutation
public class PermCheck {
    public int solution(int[] A) {
        Set<Integer> check = new HashSet<>();
        int permutation = 1;

        for (int num : A) {
            check.add(num);
        }

        if (A.length != check.size()) {
            return permutation = 0;
        }

        for (int i = 1; i <= check.size(); i++) {
            if (!check.contains(i)) {
                return permutation = 0;
            }
        }
        return permutation;
    }
}