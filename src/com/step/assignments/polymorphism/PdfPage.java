package com.step.assignments.polymorphism;

public class PdfPage implements Print{

    @Override
    public String printContent(String text) {
        return "Printable content: " + text;
    }
}
