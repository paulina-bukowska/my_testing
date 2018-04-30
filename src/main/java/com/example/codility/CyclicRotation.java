package com.example.codility;

// Rotate an array to the right by a given number of steps
public class CyclicRotation {
    public int[] solution(int[] A, int K) {
        if((A.length == K) || (K == 0)) {
                return A;
        }
        if(A.length == 0) {
            System.out.println("Table is empty!");
            return A;
        }

        int[] B = A;
        int[] rotatedA = new int[A.length];

        for(int j = 0; j < K; j++) {
            for(int i = 1; i < A.length; i++) {
                rotatedA[i] = B[i-1];
            }
            rotatedA[0] = B[B.length-1];
            B = rotatedA.clone();
        }
        return rotatedA;
    }

    public static void main (String[] args) {
        CyclicRotation rotation = new CyclicRotation();

        int[] A = {3, 8, 9, 7, 6};
        int K = 3;
        int[] rotatedA = rotation.solution(A, K); // {9, 7, 6, 3, 8}
        System.out.println(rotatedA[0]);
        System.out.println(rotatedA[1]);
        System.out.println(rotatedA[2]);
        System.out.println(rotatedA[3]);
        System.out.println(rotatedA[4]);
        System.out.println();

        int[] A2 = {5, 2, 4, 3, 0, 2, 1};
        int K2 = 7;
        int[] rotatedA2 = rotation.solution(A2, K2); // {5, 2, 4, 3, 0, 2, 1}
        System.out.println(rotatedA2[0]);
        System.out.println(rotatedA2[1]);
        System.out.println(rotatedA2[2]);
        System.out.println(rotatedA2[3]);
        System.out.println(rotatedA2[4]);
        System.out.println(rotatedA2[5]);
        System.out.println(rotatedA2[6]);
    }
}