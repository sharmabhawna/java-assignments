package com.step.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeapYearTest {

    @Test
    void shouldReturnTrueForLeapYear(){
        assertEquals(true, LeapYearCalculator.isLeapYear(1600));
        assertEquals(true, LeapYearCalculator.isLeapYear(2000));
        assertEquals(true, LeapYearCalculator.isLeapYear(2400));
    }

    @Test
    void shouldReturnFalseForNonLeapYear(){
        assertEquals(false, LeapYearCalculator.isLeapYear(-1600));
        assertEquals(false, LeapYearCalculator.isLeapYear(1700));
        assertEquals(false, LeapYearCalculator.isLeapYear(1800));
        assertEquals(false, LeapYearCalculator.isLeapYear(1900));
        assertEquals(false, LeapYearCalculator.isLeapYear(2100));
        assertEquals(false, LeapYearCalculator.isLeapYear(2200));
        assertEquals(false, LeapYearCalculator.isLeapYear(2300));
        assertEquals(false, LeapYearCalculator.isLeapYear(2500));
        assertEquals(false, LeapYearCalculator.isLeapYear(2600));
        assertEquals(false, LeapYearCalculator.isLeapYear(2017));
    }


}