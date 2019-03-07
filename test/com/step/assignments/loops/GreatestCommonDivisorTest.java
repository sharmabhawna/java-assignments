package com.step.assignments.loops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatestCommonDivisorTest {

    @Test
    void shouldReturnGreatestCommonDivisor(){
        assertEquals(5, GreatestCommonDivisor.getGreatestCommonDivisor(25, 15));
        assertEquals(6, GreatestCommonDivisor.getGreatestCommonDivisor(12, 30));
        assertEquals(9, GreatestCommonDivisor.getGreatestCommonDivisor(9, 18));
        assertEquals(9, GreatestCommonDivisor.getGreatestCommonDivisor(81, 153));
    }

}