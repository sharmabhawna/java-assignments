package com.step.assignments.loops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {


    @Test
    void shouldReturnTrueForPalindromeNumber(){
        assertEquals(true, Palindrome.isPalindrome(131));
        assertEquals(true, Palindrome.isPalindrome(1331));
        assertEquals(true, Palindrome.isPalindrome(11));
        assertEquals(true, Palindrome.isPalindrome(13131));
        assertEquals(true, Palindrome.isPalindrome(1));
    }

    @Test
    void shouldReuturnFalseForNonPalindromeNumber(){
        assertEquals(false, Palindrome.isPalindrome(13));
        assertEquals(false, Palindrome.isPalindrome(133));
        assertEquals(false, Palindrome.isPalindrome(1335));
    }

}