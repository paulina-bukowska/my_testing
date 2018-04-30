package com.example.codility;

import java.util.ArrayList;
import java.util.List;

// Find longest sequence of zeros in binary representation of an integer
public class BinaryGap {
    public int solution(int N) {
        int divisionResult = N;
        List<Integer> binaryCode = new ArrayList();
        List<Integer> code = new ArrayList();

        while(divisionResult != 0) {
           Integer bin = divisionResult % 2;
           divisionResult = divisionResult / 2;
           binaryCode.add(bin);
           code.add(bin);
        }

        for(int i = 0; binaryCode.get(i) != 1; i++) {
            code.remove(0);
        }

        if(code.contains(0)) {
            int theLongestGap = 0;
            int gap = 0;

            for(int bin : code) {
                if(bin == 0) {
                    gap++;
                }
                else if(bin == 1) {
                    if(gap > theLongestGap) {
                        theLongestGap = gap;
                        gap = 0;
                    }
                    else gap = 0;
                }
            }

            return theLongestGap;
        } else return 0;
    }

    public static void main(String[] args) {
        BinaryGap gap = new BinaryGap();

        System.out.println(gap.solution(320)); //1
        System.out.println(gap.solution(418)); //3
        System.out.println(gap.solution(9)); //2
        System.out.println(gap.solution(529)); //4
        System.out.println(gap.solution(20)); //1
        System.out.println(gap.solution(137216)); //4
        System.out.println(gap.solution(176)); //1
        System.out.println(gap.solution(1041)); //5
        System.out.println(gap.solution(15)); //0
    }
}