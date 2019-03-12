package com.step.assignments.polymorphism;

public class WebPage implements Display,Print,Action{

    @Override
    public void click(Object target) {
        System.out.println(target + " is clicked");
    }

    @Override
    public void displayContent(String text) {
        System.out.println("Displaying content on web page: " + text);
    }

    @Override
    public String printContent(String text) {
        return "Printable content on web page: " + text;
    }
}
