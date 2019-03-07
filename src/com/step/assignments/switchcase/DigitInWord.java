package com.step.assignments.switchcase;

public class DigitInWord {
    public static void main(String[] args) {
    }

    public static String getDigitInWord(int number){
        String numberInWord;

        switch (number){
            case 0:
                numberInWord = "Zero";
                break;
            case 1:
                numberInWord = "One";
                break;
            case 2:
                numberInWord = "Two";
                break;
            case 3:
                numberInWord = "Three";
                break;
            case 4:
                numberInWord = "Four";
                break;
            case 5:
                numberInWord = "Five";
                break;
            case 6:
                numberInWord = "Six";
                break;
            case 7:
                numberInWord = "Seven";
                break;
            case 8:
                numberInWord = "Eight";
                break;
            case 9:
                numberInWord = "Nine";
                break;
                default:
                    numberInWord = "Other";
        }
        return numberInWord;
    }
}
