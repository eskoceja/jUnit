package com.ctac.testing;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PositiveNumberTest {

    @Test
    public void twoShouldReturnTrue() {
        PositiveNumber number = new PositiveNumber();
        int n = 2;
        assertTrue(number.isPositive(n));
    }

    @Test
    public void negTwoShouldReturnFalse() {
        PositiveNumber number = new PositiveNumber();
        int n = -2;
        assertFalse(number.isPositive(n));
    }

    @Test
    public void zeroShouldReturnTrue() {
        PositiveNumber number = new PositiveNumber();
        int n = 0;
        assertTrue(number.isPositive(n));
    }


}