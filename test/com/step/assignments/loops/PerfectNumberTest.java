package com.step.assignments.loops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerfectNumberTest {

    @Test
    void shouldReturnTrue(){
        assertEquals(true, PerfectNumber.isPerfectNumber(6));
        assertEquals(true, PerfectNumber.isPerfectNumber(28));
    }

    @Test
    void shouldReturnFalse(){
        assertEquals(false, PerfectNumber.isPerfectNumber(5));
    }
}