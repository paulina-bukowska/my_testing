package com.example.codility;

import java.util.*;

// Find the missing element in a given permutation
public class PermMissingElem {
    public int solution(int[] A) {
        int missingElem = 0;

        if(A.length == 0) {
            return missingElem = 1;
        }

        Arrays.sort(A);

        for(int i = 0; i < A.length; i++) {
            if(A[i] != i + 1) {
                missingElem = i + 1;
                break;
            }
            missingElem = A[A.length - 1] + 1;
        }
        return missingElem;
    }

    public static void main (String[] args) {
        PermMissingElem permMissingElem = new PermMissingElem();
        int[] A = {7, 5, 1, 3, 6, 4};
        int[] B = {4, 1, 3};
        int[] C = {};
        int[] D = {1};
        int[] E = {1, 3};
        int[] F = {2, 5, 3, 6, 4};
        int[] G = {2, 5, 1, 3, 6, 4};
        int[] H = {2};

        System.out.println(permMissingElem.solution(A)); // 2
        System.out.println(permMissingElem.solution(B)); // 2
        System.out.println(permMissingElem.solution(C)); // 1
        System.out.println(permMissingElem.solution(D)); // 2
        System.out.println(permMissingElem.solution(E)); // 2
        System.out.println(permMissingElem.solution(F)); // 1
        System.out.println(permMissingElem.solution(G)); // 7
        System.out.println(permMissingElem.solution(H)); // 1
    }
}