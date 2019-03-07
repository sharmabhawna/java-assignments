package com.step.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeenNumberCheckerTest {

    @Test
    void shouldReturnTrueForTeenNumber(){
        assertEquals(true, TeenNumberChecker.isTeen(13));
        assertEquals(true, TeenNumberChecker.isTeen(15));
        assertEquals(true, TeenNumberChecker.isTeen(19));
    }

    @Test
    void shouldReturnFalseForNotATeenNumber(){
        assertEquals(false, TeenNumberChecker.isTeen(12));
        assertEquals(false, TeenNumberChecker.isTeen(20));
    }

    @Test
    void shouldReturnTrueIfAnyNumberIsTeen(){
        assertEquals(true, TeenNumberChecker.hasTeen(9, 99, 19));
        assertEquals(true, TeenNumberChecker.hasTeen(25, 15, 42));
        assertEquals(true, TeenNumberChecker.hasTeen(13, 10, 40));
    }

    @Test
    void shouldReturnFalseIfNoNumberIsTeen(){
        assertEquals(false, TeenNumberChecker.hasTeen(9, 99, 12));
        assertEquals(false, TeenNumberChecker.hasTeen(25, 20, 42));
    }
}