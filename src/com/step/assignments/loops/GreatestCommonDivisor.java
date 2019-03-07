package com.step.assignments.loops;

public class GreatestCommonDivisor {
    public static void main(String[] args) {

    }

    public static int getGreatestCommonDivisor(int firstNum, int secondNum){
        int greatestCommonDivisor = 1;
        int divisor = 1;
        int smallerNum = firstNum <= secondNum ? firstNum : secondNum;
        while (divisor <= smallerNum){
            if((firstNum % divisor == 0) && (secondNum % divisor == 0)){
                greatestCommonDivisor = divisor;
            }
            divisor++;
        }
        return greatestCommonDivisor;
    }
}
