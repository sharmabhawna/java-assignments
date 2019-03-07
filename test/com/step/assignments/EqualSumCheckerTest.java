package com.step.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EqualSumCheckerTest {

    @Test
    void shouldReturnTrue(){
        assertEquals(true, EqualSumChecker.hasEqualSum(1, -1, 0));
        assertEquals(true, EqualSumChecker.hasEqualSum(10, 0, 10));
        assertEquals(true, EqualSumChecker.hasEqualSum(0, 5, 5));
        assertEquals(true, EqualSumChecker.hasEqualSum(10, 5, 15));
    }

    @Test
    void shouldReturnFalse(){
        assertEquals(false, EqualSumChecker.hasEqualSum(1, -1, 1));
        assertEquals(false, EqualSumChecker.hasEqualSum(10, 0, 0));
        assertEquals(false, EqualSumChecker.hasEqualSum(0, 5, 50));
        assertEquals(false, EqualSumChecker.hasEqualSum(10, 5, 5));
    }
}