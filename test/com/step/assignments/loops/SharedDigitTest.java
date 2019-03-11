package com.step.assignments.loops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SharedDigitTest {

    @Test
    void shouldReturnTrueIfNumbersHaveSharedDigit() {
        assertEquals(true, SharedDigit.hasSharedDigit(2, 22));
        assertEquals(true, SharedDigit.hasSharedDigit(21, 22));
        assertEquals(true, SharedDigit.hasSharedDigit(12, 22));
    }

    @Test
    void shouldReturnFalseIfNumbersDoNotHaveSharedDigit() {
        assertEquals(false, SharedDigit.hasSharedDigit(1, 22));
        assertEquals(false, SharedDigit.hasSharedDigit(11, 22));
    }

}