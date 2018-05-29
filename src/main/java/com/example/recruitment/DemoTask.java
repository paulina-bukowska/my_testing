package com.example.recruitment;

import java.util.HashSet;
import java.util.Set;

//  Find the smallest positive integer (greater than 0) that does not occur in a given array
public class DemoTask {
    public int solution(int[] A) {
        Set<Integer> numbersFromA = new HashSet<>();

        for(int i=0; i < A.length; i++) {
            if(A[i] > 0) {
                numbersFromA.add(A[i]);
            }
        }
        if(numbersFromA.isEmpty()) {
            return 1;
        }

        int counter = 0;

        for(int i=1; i<=numbersFromA.size(); i++) {
            counter++;
            if(!numbersFromA.contains(i)) {
                return i;
            }
        }
        return counter+1;
    }
}