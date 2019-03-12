package com.step.assignments.polymorphism;

public class Console implements Display {

    @Override
    public void displayContent(String text) {
        System.out.println("Displaying content on console : " + text);
    }
}
