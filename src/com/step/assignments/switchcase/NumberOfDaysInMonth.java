package com.step.assignments.switchcase;

import com.step.assignments.LeapYearCalculator;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {

    }

    public static int getDaysInMonth(int month, int year){
        if(year < 1 || year > 9999){
            return -1;
        }

        int daysInMonth;
        switch (month){
            case 1:
                daysInMonth = 31;
                break;

            case 2:
                daysInMonth = 28;
                if(LeapYearCalculator.isLeapYear(year)){
                    daysInMonth = 29;
                }
                break;

            case 3:
                daysInMonth = 31;
                break;

            case 4:
                daysInMonth = 30;
                break;

            case 5:
                daysInMonth = 31;
                break;

            case 6:
                daysInMonth = 30;
                break;

            case 7:
                daysInMonth = 31;
                break;

            case 8:
                daysInMonth = 31;
                break;

            case 9:
                daysInMonth = 30;
                break;

            case 10:
                daysInMonth = 31;
                break;

            case 11:
                daysInMonth = 30;
                break;

            case 12:
                daysInMonth = 31;
                break;

            default:
                daysInMonth = -1;

        }
        return daysInMonth;
    }
}
