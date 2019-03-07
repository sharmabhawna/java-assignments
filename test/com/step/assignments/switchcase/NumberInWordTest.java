package com.step.assignments.switchcase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitInWordTest {

    @Test
    void shouldReturnNumberInWord(){
        assertEquals("Zero", DigitInWord.getDigitInWord(0));
        assertEquals("One", DigitInWord.getDigitInWord(1));
        assertEquals("Two", DigitInWord.getDigitInWord(2));
        assertEquals("Three", DigitInWord.getDigitInWord(3));
        assertEquals("Four", DigitInWord.getDigitInWord(4));
        assertEquals("Five", DigitInWord.getDigitInWord(5));
        assertEquals("Six", DigitInWord.getDigitInWord(6));
        assertEquals("Seven", DigitInWord.getDigitInWord(7));
        assertEquals("Eight", DigitInWord.getDigitInWord(8));
        assertEquals("Nine", DigitInWord.getDigitInWord(9));
    }

}