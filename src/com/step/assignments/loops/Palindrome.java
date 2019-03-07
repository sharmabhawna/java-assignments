package com.step.assignments.loops;

import com.step.assignments.Utils;

public class Palindrome {

    public static void main(String[] args) {

    }

    public static boolean isPalindrome(int number){
        return number == Utils.reverse(number);
    }


}
