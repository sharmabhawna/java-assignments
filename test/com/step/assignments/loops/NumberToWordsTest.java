package com.step.assignments.loops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberToWordsTest {

    @Test
    void shouldReturnNumberInWords(){
        assertEquals("One", NumberToWords.numberToWords(1));
        assertEquals("One Two", NumberToWords.numberToWords(12));
        assertEquals("One Zero Zero", NumberToWords.numberToWords(100));
        assertEquals("One Two Three", NumberToWords.numberToWords(123));
        assertEquals("One Two Three Four", NumberToWords.numberToWords(1234));
    }

}