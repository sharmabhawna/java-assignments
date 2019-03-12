package com.step.assignments.polymorphism;

public class Main {

    public static void main(String[] args) {

        Console console = new Console();
        console.displayContent("Some text");
        System.out.println("----------------");

        PdfPage pdfPage = new PdfPage();
        System.out.println(pdfPage.printContent("Some content"));
        System.out.println("----------------");

        WebPage webPage = new WebPage();
        webPage.displayContent("Welcome to Learning Java");
        webPage.click("Download");
        System.out.println(webPage.printContent("Soft copy of learningJava.pdf"));
        System.out.println("----------------");

        WebPage nonInteractiveWebPage = new NonInteractiveWebPage();
        nonInteractiveWebPage.displayContent("Welcome to Learning JavaScript");
        nonInteractiveWebPage.click("Download");
        System.out.println(nonInteractiveWebPage.printContent("Soft copy of learningJavaScript.pdf"));

    }
}
