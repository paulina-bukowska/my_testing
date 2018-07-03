package com.example.codility;

import java.util.HashSet;
import java.util.Set;

// Find the smallest positive integer that does not occur in a given sequence.
public class MissingInteger {
    public int solution(int[] A) {
        Set<Integer> positiveNum = new HashSet<>();
        int theSmallest = 1;

        for (int num : A) {
            if (num > 0) {
                positiveNum.add(num);
            }
        }

        if (positiveNum.size() == 0) {
            return theSmallest;
        }

        for (int i = 1; i <= positiveNum.size(); i++) {
            if (!positiveNum.contains(i)) {
                return theSmallest = i;
            }
            if (i == positiveNum.size()) {
                return theSmallest = i + 1;
            }
        }
        return theSmallest;
    }
}