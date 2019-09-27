package com.example;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeTestSuite {
    Palindrome palindrome = new Palindrome();

    @Test
    public void testFindLongestPalindrome() {
        //Given
        String first = "Motor";
        String second = "otkyktzaa";
        String third = "szlawketotekws";
        String fourth = "jbybontrusurt";
        String fifth = "odrrdo";
        String sixth = "xgagxxxstootsx";
        String sevennth = "firhjurif";
        String eighth = "wertyuuiop";
        String nineth = "rrhhmmoollff";

        String martinFirst = "abcdefxxxyzzzyxxxhij";
        String martinSecond = "abcdefxxxyzzyxxhij";
        String martinThird = "abcdekajakfgabkajakbaijmncddczz";
        String martinFourth = "aaabbccccddd";

        //When
        int longestPalindromeFirst = palindrome.findLongestPalindrome(first);
        int longestPalindromeSecond = palindrome.findLongestPalindrome(second);
        int longestPalindromeThird = palindrome.findLongestPalindrome(third);
        int longestPalindromeFourth = palindrome.findLongestPalindrome(fourth);
        int longestPalindromeFifth = palindrome.findLongestPalindrome(fifth);
        int longestPalindromeSixth = palindrome.findLongestPalindrome(sixth);
        int longestPalindromeSevennth = palindrome.findLongestPalindrome(sevennth);
        int longestPalindromEighth = palindrome.findLongestPalindrome(eighth);
        int longestPalindromNineth = palindrome.findLongestPalindrome(nineth);

        int longestPalindromMartinFirst = palindrome.findLongestPalindrome(martinFirst);
        int longestPalindromMartinSecond = palindrome.findLongestPalindrome(martinSecond);
        int longestPalindromMartinThird = palindrome.findLongestPalindrome(martinThird);
        int longestPalindromMartinFourth = palindrome.findLongestPalindrome(martinFourth);

        //Then
        Assert.assertEquals(3, longestPalindromeFirst);
        Assert.assertEquals(5, longestPalindromeSecond);
        Assert.assertEquals(9, longestPalindromeThird);
        Assert.assertEquals(7, longestPalindromeFourth);
        Assert.assertEquals(6, longestPalindromeFifth);
        Assert.assertEquals(8, longestPalindromeSixth);
        Assert.assertEquals(1, longestPalindromeSevennth);
        Assert.assertEquals(2, longestPalindromEighth);
        Assert.assertEquals(2, longestPalindromNineth);

        Assert.assertEquals(11, longestPalindromMartinFirst);
        Assert.assertEquals(8, longestPalindromMartinSecond);
        Assert.assertEquals(9, longestPalindromMartinThird);
        Assert.assertEquals(4, longestPalindromMartinFourth);
    }

    @Test
    public void testIsPalindrome() {
        //Given
        String first = "kajak";
        String second = "lampka";
        String third = "kolelok";

        //When
        boolean isPalindromeFirst = palindrome.isPalindrome(first);
        boolean isPalindromeSecond = palindrome.isPalindrome(second);
        boolean isPalindromeThird = palindrome.isPalindrome(third);

        //Then
        Assert.assertTrue(isPalindromeFirst);
        Assert.assertFalse(isPalindromeSecond);
        Assert.assertTrue(isPalindromeThird);
    }
}
