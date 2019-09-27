package com.example;

// A palindrome is a word that reads the same backward or forward.
//Write a function that checks if a given word is a palindrome. Character case should be ignored.
//For example, isPalindrome("Deleveled") should return true as character case should be ignored, resulting in "deleveled", which is a palindrome since it reads the same backward and forward.
public class Palindrome {
    public boolean isPalindrome(String word) {
        char[] wordAsChars = word.toLowerCase().toCharArray();

        int a = 0;
        int b = wordAsChars.length -1;

        while (a < b) {
            if (wordAsChars[a] != wordAsChars[b]) {
                return false;
            }
            a++;
            b--;
        }
        return true;
    }

    // how many letters has the longest palindrome in the given String
    public int findLongestPalindrome(String word) {
        int longestPalindrome = 1;

        char[] wordAsChars = word.toLowerCase().toCharArray();

        for (int a = 0; a < wordAsChars.length-2; a++) {
            int k = a;
            int tempPalindrome = 0;

            for (int b = wordAsChars.length -1; b > k; b--) {
                if (wordAsChars[k] == wordAsChars[b]) {
                    tempPalindrome = tempPalindrome + 2;
                    k++;

                    if (b == k) {
                        if (tempPalindrome > longestPalindrome) {
                            longestPalindrome = tempPalindrome;
                        }
                    }

                    if (b - 1 == k) {
                        tempPalindrome++;
                        if (tempPalindrome > longestPalindrome) {
                            longestPalindrome = tempPalindrome;
                        }

                    }
                }
            }
        }
        return longestPalindrome;
    }
}
