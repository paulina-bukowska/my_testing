package com.example.recruitment;

// Find how many saddle points are in a given matrix
public class SaddlePoint {
    public int solution(int[][] A) {
        int counter = 0;

        for(int p = 1; p < A.length-1; p++) {
            for(int q = 1; q < A[p].length-1; q++) {
                if((A[p][q] < A[p][q+1]) && (A[p][q] < A[p][q-1]) && (A[p][q] > A[p+1][q]) && (A[p][q] > A[p-1][q])) {
                    counter++;
                }
                if((A[p][q] > A[p][q+1]) && (A[p][q] > A[p][q-1]) && (A[p][q] < A[p+1][q]) && (A[p][q] < A[p-1][q])) {
                    counter++;
                }
            }
        }
        return counter;
    }
}