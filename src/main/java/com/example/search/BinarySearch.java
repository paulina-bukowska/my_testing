package com.example.search;

public class BinarySearch {
    public int binarySearch(int[] input, int number) {
        int begin = 0;
        int end = input.length - 1;
        int middle = (begin + end) / 2;

        while (begin <= end) {
            if (input[middle] < number) {
                begin = middle + 1;
            } else if (input[middle] == number) {
                return middle;
            } else {
                end = middle - 1;
            }
            middle = (begin + end) / 2;
        }
        if (begin > end) {
            return -1;
        }

        return begin;
    }
}
