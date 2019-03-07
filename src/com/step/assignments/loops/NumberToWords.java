package com.step.assignments.loops;

import com.step.assignments.Utils;
import com.step.assignments.switchcase.DigitInWord;

public class NumberToWords {

    public static void main(String[] args) {

    }

//    public static String numberToWords(int number){
//        int reverse = Utils.reverse(number);
//        String result = "";
//        String delimiter = "";
//        while (reverse > 0){
//            int rem = reverse % 10;
//            reverse = reverse / 10;
//            result = result + delimiter + DigitInWord.getDigitInWord(rem);
//            delimiter = " ";
//        }
//        return result;
//    }

    public static String numberToWords(int number){
        String result = "";
        String delimiter = "";
        while (number > 0){
            int rem = number % 10;
            number = number / 10;
            result = result + delimiter + DigitInWord.getDigitInWord(rem);
            delimiter = " ";
        }
        return Utils.reverse(result);
    }
}
