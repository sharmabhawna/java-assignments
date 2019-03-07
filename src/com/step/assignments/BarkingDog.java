package com.step.assignments;

public class BarkingDog {
    public static void main(String[] args) {
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        return (hourOfDay >= 1 && hourOfDay <= 23) && (barking && hourOfDay < 8 || hourOfDay > 22);
    }
}
