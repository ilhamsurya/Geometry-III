package com.geometry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    public void shouldReturnLengthWhenYIsDifferent() {
        Line line = new Line(0, 0, 0, 5);
        assertEquals(5, line.length(), EPS);
    }

    @Test
    public void shouldReturnLengthWhenPointsAreDifferent() {
        Line line = new Line(0, 0, 3, 4);
        assertEquals(5, line.length(), EPS);
    }

    @Test
    public void shouldReturnTrueWhenLinesIsCompared() {
        Line line1 = new Line(0, 0, 0, 0);
        assertTrue(line1.isEqual(line1, line1));
    }

    @Test
    public void shouldReturnFalseWhenXIsDifferent() {
        Line line1 = new Line(0, 0, 1, 1);
        Line line2 = new Line(1, 0, 1, 1);
        assertFalse(line1.isEqual(line1, line2));
    }
}
