package com.step.assignments.loops;

public class Sum {
    public static void main(String[] args) {

    }

    public static int sumDigits(int number){
        int sum = 0;
        do{
            int rem = number % 10;
            number = number / 10;
            sum = sum + rem;
        }while (number > 0);
        return sum;
    }

    public static int sumFirstAndLastDigit(int number){
        int lastDigit = number % 10;
        int firstDigit = 0;
        while (number > 0){
            firstDigit = number;
            number = number / 10;
        }
        return firstDigit + lastDigit;
    }

    public static int sumEvenDigits(int number){
        int sum = 0;
        while (number > 0){
            int rem = number % 10;
            number = number / 10;
            if(rem % 2 == 0){
                sum = sum + rem;
            }
        }
        return sum;
    }
}
