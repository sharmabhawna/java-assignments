package com.step.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PoundsToKgTest {

    @Test
    void shouldConvertPoundToKg(){
        double actual = PoundsToKg.toKg(200);
        assertEquals(90.7184d, actual);
    }

}