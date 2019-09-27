package com.example.codility;

import java.util.Arrays;

// Calculate the values of counters after applying all alternating operations:
// - increase counter by 1
// - set value of all counters to current maximum
public class MaxCounters {
    // Time complexity - Quadratic time :/
    public int[] solution(int N, int[] A) {
        int[] result = new int[N];

        for (int num : A) {
            if (num <= N) {
                result[num-1] += 1;
            }

            if (num == N+1) {
                int[] resultClone = result.clone();
                Arrays.sort(resultClone);
                int maxValue = resultClone[N-1];

                for (int i=0; i<N; i++) {
                    result[i] = maxValue;
                }
            }
        }
        return result;
    }
}