package com.step.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BarkingDogsTest {

    @Test
    void shouldWakeUp(){
        assertEquals(true, BarkingDog.shouldWakeUp(true, 1));
    }

    @Test
    void shouldNotWakeUp(){
        assertEquals(false, BarkingDog.shouldWakeUp(false, 2));
        assertEquals(false, BarkingDog.shouldWakeUp(true, 8));
        assertEquals(false, BarkingDog.shouldWakeUp(true, -1));
    }

}