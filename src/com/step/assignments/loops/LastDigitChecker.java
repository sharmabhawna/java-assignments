package com.step.assignments.loops;

public class LastDigitChecker {
    public static void main(String[] args) {

    }

    public static boolean hasLastDigitSame(int firstNum, int secondNum, int thirdNum){
        return (getLastDigit(firstNum) == getLastDigit(secondNum)) || (getLastDigit(firstNum) == getLastDigit(thirdNum) || getLastDigit(secondNum) == getLastDigit(thirdNum));
    }

    public static int getLastDigit(int number){
        return number % 10;
    }
}
