package com.step.assignments.loops;

import com.step.assignments.Utils;

public class Sum {
    public static void main(String[] args) {

    }

    public static int sumDigits(int number) {
        int sum = 0;
        do {
            int rem = number % 10;
            number = number / 10;
            sum = sum + rem;
        } while (number > 0);
        return sum;
    }

    public static int sumFirstAndLastDigit(int number) {
        int lastDigit = number % 10;
        int firstDigit = 0;
        while (number > 0) {
            firstDigit = number;
            number = number / 10;
        }
        return firstDigit + lastDigit;
    }

    public static int sumEvenDigits(int number) {
        int sum = 0;
        while (number > 0) {
            int rem = number % 10;
            number = number / 10;
            if (Utils.isEven(rem)) {
                sum = sum + rem;
            }
        }
        return sum;
    }

    public static int sumNumbersDivisibleByThreeAndFive(int lowerLimit, int upperLimit) {
        int sum = 0;
        int candidate = lowerLimit;
        while (Utils.isInBetween(candidate, lowerLimit, upperLimit)) {
            if (Utils.isMultipleOf(candidate, new int[]{3, 5})) {
                sum = sum + candidate;
            }
            candidate++;
        }
        return sum;
    }

    public static int sumOddNumbers(int lowerLimit, int upperLimit) {
        int sum = 0;
        int candidate = lowerLimit;
        while (Utils.isInBetween(candidate, lowerLimit, upperLimit)) {
            if (Utils.isOdd(candidate)) {
                sum = sum + candidate;
            }
            candidate++;
        }
        return sum;
    }

}
