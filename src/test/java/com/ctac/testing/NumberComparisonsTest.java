package com.ctac.testing;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumberComparisonsTest {
    @Test
    public void numbersShouldBeEqual() {
        int a = 4;
        int b = 4;
        NumberComparisons comparer = new NumberComparisons();
        assertEquals(true, comparer.comparingNumbers(a, b));
        assertTrue(comparer.comparingNumbers(a, b));
    }

    @Test
    public void aIsGreaterThanBShouldBeFalse() {
        int a = 5;
        int b = 4;
        NumberComparisons comparer = new NumberComparisons();
        assertEquals(false, comparer.comparingNumbers(a, b));
        assertFalse(comparer.comparingNumbers(a, b));
    }

    @Test
    public void aisLessThanBShouldBeFalse() {
        int a = 4;
        int b = 5;
        NumberComparisons comparer = new NumberComparisons();
        assertEquals(false, comparer.comparingNumbers(a, b));
        assertFalse(comparer.comparingNumbers(a, b));
    }


}