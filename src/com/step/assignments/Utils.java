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

        String delimiter = "";

        for(int index = 0; index < length; index++){
            reverseText = reverseText + delimiter + textArray[(length-1)-index];
            delimiter = " ";
        }

        return reverseText;
    }

    public static boolean isDivisibleBy(int dividend, int divisor){
        return dividend % divisor == 0;
    }

    public static boolean isMultipleOf(int multiple, int[] factors){
        boolean isMultiple = true;
        for (int factor : factors) {
            if(!(isDivisibleBy(multiple, factor))){
                isMultiple = false;
            }
        }
        return isMultiple;
    }

    public static boolean isEven(int number){
        return isDivisibleBy(number, 2);
    }
}
