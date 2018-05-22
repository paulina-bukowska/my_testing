package com.example.devskiller;

//Implement the warmup. MyWarmup.findMax(int[] array) method that returns the position of the highest value in the array, or -1 if the array is empty.
//If the highest value occurs more than once, return the position of it's first occurence in the array.

public class HighestValueIndex {
    public int findMax(int[] array) {
            int len = array.length;

            if (len == 0) {
                return -1;
            }

            int highestNum = array[0];
            int highestIndex = 0;

            for (int i = 1; i < len; i++) {
                if (array[i] > highestNum) {
                    highestNum = array[i];
                    highestIndex = i;
                }
            }
            return highestIndex;
        }
}