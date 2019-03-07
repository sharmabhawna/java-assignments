package com.step.assignments.inheritance;

public class Car extends Vehicle {

    int gears;

    public Car(int speed, int gears) {
        super(speed);
        this.gears = gears;
    }

    public void changingGears(){
        System.out.println("Gears are changing");
    }
}
