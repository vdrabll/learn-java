package org.example;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    private final Random random = new Random();
    private final Task1 t1 = new Task1();

    @Test
    void mean() {
        assertDoesNotThrow(() -> t1.mean(anyValidValues()));
        assertThrowsExactly(IllegalArgumentException.class, () -> t1.mean(null), "Empty values");
        assertThrowsExactly(IllegalArgumentException.class, () -> t1.mean(new double[]{}), "Empty values");

        var testArray = new double[]{1, 2, 3, 4, 5, 6, 7};
        assertEquals(4, t1.mean(testArray));

        testArray = new double[]{9, 10, 12, 13, 13, 13, 15, 15, 16, 16, 18, 22, 23, 24, 24, 25};
        assertEquals(16.75, t1.mean(testArray));

        testArray = new double[]{5.1234, 10, 15, 15.4, 23, 24.5, 32.12, 43.1, 100.2, 432};
        assertEquals(70.04434, t1.mean(testArray));
    }

    @Test
    void median() {
        assertDoesNotThrow(() -> t1.median(anyValidValues()));
        assertThrowsExactly(IllegalArgumentException.class, () -> t1.median(null), "Empty values");
        assertThrowsExactly(IllegalArgumentException.class, () -> t1.median(new double[]{}), "Empty values");

        var testArray = new double[]{1, 2, 3, 4, 5, 6, 7};
        assertEquals(4, t1.median(testArray));

        testArray = new double[]{9, 10, 12, 13, 13, 13, 15, 15, 16, 16, 18, 22, 23, 24, 24, 25};
        assertEquals(15.5, t1.median(testArray));

        testArray = new double[]{5.1234, 10, 15, 15.4, 23, 24.5, 32.12, 43.1, 100.2, 432};
        assertEquals(23.75, t1.median(testArray));
    }

    @Test
    void sum() {
        assertDoesNotThrow(() -> t1.sum(anyValidValues()));
        assertThrowsExactly(IllegalArgumentException.class, () -> t1.sum(null), "Empty values");
        assertThrowsExactly(IllegalArgumentException.class, () -> t1.sum(new double[]{}), "Empty values");

        var testArray = new double[]{1, 2, 3, 4, 5, 6, 7};
        assertEquals(28, t1.sum(testArray));

        testArray = new double[]{9, 10, 12, 13, 13, 13, 15, 15, 16, 16, 18, 22, 23, 24, 24, 25};
        assertEquals(268, t1.sum(testArray));

        testArray = new double[]{5.1234, 10, 15, 15.4, 23, 24.5, 32.12, 43.1, 100.2, 432};
        assertEquals(700.4434, t1.sum(testArray));
    }

    @Test
    void standardDeviation() {
        assertDoesNotThrow(() -> t1.standardDeviation(anyValidValues()));
        assertThrowsExactly(IllegalArgumentException.class, () -> t1.standardDeviation(null), "Empty values");
        assertThrowsExactly(IllegalArgumentException.class, () -> t1.standardDeviation(new double[]{}), "Empty values");

        var testArray = new double[]{1, 2, 3, 4, 5, 6, 7};
        assertEquals(2, t1.standardDeviation(testArray));

        testArray = new double[]{9, 10, 12, 13, 13, 13, 15, 15, 16, 16, 18, 22, 23, 24, 24, 25};
        assertEquals(5.1173, t1.standardDeviation(testArray));

        testArray = new double[]{5.1234, 10, 15, 15.4, 23, 24.5, 32.12, 43.1, 100.2, 432};
        assertEquals(123.3729, t1.standardDeviation(testArray));
    }

    @Test
    void firstQuartile() {
        assertDoesNotThrow(() -> t1.firstQuartile(anyValidValues()));
        assertThrowsExactly(IllegalArgumentException.class, () -> t1.firstQuartile(null), "Empty values");
        assertThrowsExactly(IllegalArgumentException.class, () -> t1.firstQuartile(new double[]{}), "Empty values");

        var testArray = new double[]{1, 2, 3, 4, 5, 6, 7};
        assertEquals(2, t1.firstQuartile(testArray));

        testArray = new double[]{9, 10, 12, 13, 13, 13, 15, 15, 16, 16, 18, 22, 23, 24, 24, 25};
        assertEquals(13, t1.firstQuartile(testArray));

        testArray = new double[]{5.1234, 10, 15, 15.4, 23, 24.5, 32.12, 43.1, 100.2, 432};
        assertEquals(15, t1.firstQuartile(testArray));
    }

    @Test
    void thirdQuartile() {
        assertDoesNotThrow(() -> t1.thirdQuartile(anyValidValues()));
        assertThrowsExactly(IllegalArgumentException.class, () -> t1.thirdQuartile(null), "Empty values");
        assertThrowsExactly(IllegalArgumentException.class, () -> t1.thirdQuartile(new double[]{}), "Empty values");

        var testArray = new double[]{1, 2, 3, 4, 5, 6, 7};
        assertEquals(6, t1.thirdQuartile(testArray));

        testArray = new double[]{9, 10, 12, 13, 13, 13, 15, 15, 16, 16, 18, 22, 23, 24, 24, 25};
        assertEquals(22.5, t1.thirdQuartile(testArray));

        testArray = new double[]{5.1234, 10, 15, 15.4, 23, 24.5, 32.12, 43.1, 100.2, 432};
        assertEquals(43.1, t1.thirdQuartile(testArray));
    }

    private double[] anyValidValues() {
        return random.doubles(random.nextInt(30)).toArray();
    }
}