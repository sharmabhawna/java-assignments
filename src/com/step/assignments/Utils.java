package com.step.assignments;

public class Utils {

    public static int reverse(int number){
        int reverse = 0;
        while (number > 0){
            int rem = number % 10;
            number = number / 10;
            reverse = reverse * 10 + rem;
        }
        return reverse;
    }

    public static String reverse(String text){
        String reverseText = "";

        String[] textArray = text.split(" ");

        int length = textArray.length;

        String[] reverseTextArray = new String[length];

        for(int index = 0; index < length; index++){
            reverseTextArray[index] = textArray[length-1-index];
        }

        int index = 0;
        String delimiter = "";
        while (index < length){
            reverseText = reverseText + delimiter + reverseTextArray[index];
            delimiter = " ";
            index++;
        }
        return reverseText;
    }
}
