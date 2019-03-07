package com.step.assignments.methodoverloading;

public class MinutesToYearDaysCalculator {
    public static void main(String[] args) {

        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
            return;
        }
        long hours = (long) minutes/60;
        long days = (long) hours/24;
        long years = (long) days/365;
        long leftDays = (long) days % 365;
        System.out.println(minutes + " min = " + years + " y " + leftDays + " d");
    }
}
