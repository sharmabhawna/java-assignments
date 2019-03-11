package com.step.assignments.loops;

public class SharedDigit {

    public static boolean hasSharedDigit(int firstNumber, int secondNumber){
        while (firstNumber > 0){
            int secondNum = secondNumber;
            while (secondNum > 0){
                if(firstNumber % 10 == secondNum % 10){
                    return true;
                }
                secondNum = secondNum / 10;
            }
            firstNumber = firstNumber / 10;
        }
        return false;
    }
}
