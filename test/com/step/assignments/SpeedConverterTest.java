package com.step.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpeedConverterTest {
    @Test
    void shouldConvertKmPerHourToMilesPerHour(){
        assertEquals(1, SpeedConverter.toMilesPerHour(1.5));
        assertEquals(6, SpeedConverter.toMilesPerHour(10.25));
        assertEquals(-1, SpeedConverter.toMilesPerHour(-5.6));
        assertEquals(16, SpeedConverter.toMilesPerHour(25.42));
        assertEquals(47, SpeedConverter.toMilesPerHour(75.114));

    }
}