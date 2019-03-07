package com.step.assignments.loops;

public class Factors {
    public static void main(String[] args) {
        printFactors(6);
        printFactors(32);
        printFactors(10);
    }

    public static void printFactors(int number){
        int divisor = 1;
        while (divisor <= number){
            if(number % divisor == 0){
                System.out.println(divisor);
            }
            divisor++;
        }
    }
}
