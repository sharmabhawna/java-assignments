package com.step.assignments.loops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LastDigitCheckerTest {

    @Test
    void shouldReturnLastDigit(){
        assertEquals(1, LastDigitChecker.getLastDigit(1));
        assertEquals(2, LastDigitChecker.getLastDigit(12));
        assertEquals(3, LastDigitChecker.getLastDigit(123));
    }

    @Test
    void shouldReturnTrue(){
        assertEquals(true, LastDigitChecker.hasLastDigitSame(121, 131, 132));
        assertEquals(true, LastDigitChecker.hasLastDigitSame(121, 132, 132));
        assertEquals(true, LastDigitChecker.hasLastDigitSame(122, 131, 132));
        assertEquals(true, LastDigitChecker.hasLastDigitSame(113, 123, 133));
    }

    @Test
    void shouldReturnFalse(){
        assertEquals(false, LastDigitChecker.hasLastDigitSame(121, 122, 123));
    }
}