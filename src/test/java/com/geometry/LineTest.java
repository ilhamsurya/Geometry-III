package com.geometry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LineTest {
    private static final double EPS = 0.0001;

    @Test
    public void shouldReturnZeroWhenPointsAreIdentical() {
        Line line = new Line(0, 0, 0, 0);
        assertEquals(0, line.length(), EPS);
    }

    @Test
    public void shouldReturnLengthWhenXIsDifferent() {
        Line line = new Line(0, 0, 5, 0);
        assertEquals(5, line.length(), EPS);
    }
}
