package com.example.codility;

import java.util.ArrayList;
import java.util.List;

// Count the number of passing cars on the road
public class PassingCars {
    public int solution(int[] A) {
        List<Integer> east = new ArrayList<>();
        List<Integer> west = new ArrayList<>();

        for (int i=0; i<A.length; i++) {
            if (A[i] == 0) {
                east.add(i);
            }
            else {
                west.add(i);
            }
        }

        int pairsOfPassingCars = 0;

        for (int zero : east) {
            for (int one : west) {
                if (one > zero) {
                    pairsOfPassingCars += 1;
                    if (pairsOfPassingCars > 1000000000) {
                        return -1;
                    }
                }
            }
        }
        return pairsOfPassingCars;
    }
}