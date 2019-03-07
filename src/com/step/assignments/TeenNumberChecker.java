package com.step.assignments;

public class TeenNumberChecker {
    public static void main(String[] args) {

    }

    public static boolean isTeen(int num){
        return num >= 13 && num <= 19;
    }

    public static boolean hasTeen(int firstNum, int secondNum, int thirdNum){
        return isTeen(firstNum) || isTeen(secondNum) || isTeen(thirdNum);
    }
}
