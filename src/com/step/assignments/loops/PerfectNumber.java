package com.step.assignments.loops;

public class PerfectNumber {
    public static void main(String[] args) {
    }

    public static boolean isPerfectNumber(int number){
        int divisor = 1;
        int sum = 0;
        while (divisor < number){
            if(number % divisor == 0){
                sum = sum + divisor;
            }
            divisor++;
        }
        return number == sum;
    }
}
