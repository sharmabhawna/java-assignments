package com.step.assignments.methodoverloading;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlayingCatTest {

    @Test
    void shouldReturnTrue(){
        assertEquals(true, PlayingCat.isCatPlaying(true, 30));
        assertEquals(true, PlayingCat.isCatPlaying(false, 30));
    }

    @Test
    void shouldReturnFalse(){
        assertEquals(false, PlayingCat.isCatPlaying(true, 10));
        assertEquals(false, PlayingCat.isCatPlaying(false, 10));
    }

}