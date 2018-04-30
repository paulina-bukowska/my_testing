package com.example.codility;

import java.util.Arrays;

// Find value that occurs in odd number of elements
public class OddOccurrencesInArray {
    public int solution(int[] A) {
        int unpaired = 0;

        if (A.length % 2 == 0) {
            System.out.println("An array should contain an odd number of elements!");
        } else {
            Arrays.sort(A);
            for(int i = 0; i < A.length-1; i=i+2) {
                if(A[i] != A[i+1]) {
                    unpaired = A[i];
                    break;
                } else {
                    unpaired = A[A.length-1];
                }
            }
        }
        return unpaired;
    }

    public static void main (String[] args) {
        OddOccurrencesInArray odd = new OddOccurrencesInArray();

        int[] A = {9, 8, 3, 8, 3, 2, 2};
        System.out.println(odd.solution(A)); // 9
    }
}