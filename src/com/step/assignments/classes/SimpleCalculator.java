package com.step.assignments.classes;

public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

    public SimpleCalculator(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getSum() {
        return this.firstNumber + this.secondNumber;
    }

    public double getDifference() {
        return this.firstNumber - this.secondNumber;
    }

    public double getProduct() {
        return this.firstNumber * this.secondNumber;
    }

    public double getQuotient() {
        return this.firstNumber / this.secondNumber;
    }

    public double getRemainder() {
        return this.firstNumber % this.secondNumber;
    }
}
