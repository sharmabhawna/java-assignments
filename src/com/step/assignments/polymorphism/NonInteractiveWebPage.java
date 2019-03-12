package com.step.assignments.polymorphism;

public class NonInteractiveWebPage extends WebPage{

    @Override
    public void click(Object target){
        System.out.println("Click is not supported");
    }
}
