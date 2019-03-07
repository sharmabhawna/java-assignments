package com.step.assignments.switchcase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberOfDaysInMonthTest {

    @Test
    void shouldReturnNumberOfDaysInGivenMonthOfGivenYear(){
        assertEquals(31, NumberOfDaysInMonth.getDaysInMonth(1, 2020));
        assertEquals(29, NumberOfDaysInMonth.getDaysInMonth(2, 2020));
        assertEquals(28, NumberOfDaysInMonth.getDaysInMonth(2, 2018));
        assertEquals(-1, NumberOfDaysInMonth.getDaysInMonth(-1, 2020));
        assertEquals(-1, NumberOfDaysInMonth.getDaysInMonth(1, -2020));
    }

}