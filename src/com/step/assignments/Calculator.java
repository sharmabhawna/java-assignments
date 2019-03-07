package com.step.assignments;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        int sum = 0;
        int avg = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            int num = scanner.nextInt();
            count++;
            sum = sum + num;
        }

        avg = Math.round(sum / count);
        System.out.println("Sum = " + sum + "Avg = " + avg);
        scanner.close();
        return;
    }
}
