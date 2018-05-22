package com.example.devskiller;

//Method will find the starting index where the second parameter occurs as a sub-array in the array given as the first parameter.
//If given sub-array (second parameter) occurs more than once then the method should return the starting index of the last occurrence.
//Your implementations should return `-1` if the sub-array cannot be found.

public class FindArray {
    public int findArray(int[] array, int[] subArray) {
        int subLen = subArray.length;

        int index = -1;
        if(subArray.length == 0) {
            return index;
        }

        for(int i = array.length - 1; i >= 0; i--) {
            if(array[i] == subArray[subLen - 1]) {
                index = i;
                if(subLen > 1) {
                    int k = i;
                    for (int j = subLen - 2; j >= 0; j--) {
                        if (array[k - 1] == subArray[j]) {
                            index = k - 1;
                            if (j == 0) {
                                return index;
                            }
                            k = k - 1;
                        }
                        else {
                            index = -1;
                            break;
                        }
                    }
                }
                else {
                    return index;
                }
            }
        }
        return index;
    }
}