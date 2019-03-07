package com.step.assignments;

public class SpeedConverter {
    public static void main(String[] args) {
        printConversion(1.5);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour > 0) {
            long milesPerHour = Math.round(kilometersPerHour / 1.609);
            return milesPerHour;
        }
        return -1;
    }

    public static void printConversion(double kilometersPerHour){
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        if(milesPerHour < 0){
            System.out.println("Invalid value");
            return;
        }
        System.out.println(kilometersPerHour + "km/h = " + milesPerHour + " mi/h");
    }
}
