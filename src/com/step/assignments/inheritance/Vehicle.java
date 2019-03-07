package com.step.assignments.inheritance;

public class Vehicle {

    private int speed;

    public Vehicle(int speed) {
        this.speed = speed;
    }

    public void increasingSpeed(){
        System.out.println("Speed is increasing");
    }

    public void decreasingSpeed(){
        System.out.println("Speed is decreasing");
    }
}
