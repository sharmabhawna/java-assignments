package com.step.assignments;

public class PoundsToKg {
    public static void main(String[] args) {
        double pounds = Integer.parseInt(args[0]);
        double kilos = toKg(pounds);
        System.out.println(pounds + " pounds = " + kilos + " kg");
    }

    public static double toKg(double pounds){
        return 0.453592d * pounds;
    }
}
