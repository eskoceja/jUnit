package com.ctac.testing;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class CalculationsTest {

    @DisplayName("Testing sum() method")
    @Test
    public void sumShouldReturnFour() {
        int a = 2;
        int b = 2;
        Calculations calculator = new Calculations();
        assertEquals(4, calculator.sum(a, b));
    }

    @Test
    public void sumShouldReturnEleven() {
        int a = 5;
        int b = 6;
        Calculations calculator = new Calculations();
        assertEquals(11, calculator.sum(a, b));
    }

    @DisplayName("Testing difference() method")
    @Test
    public void differenceShouldReturnFour() {
        int a = 14;
        int b = 10;
        Calculations calculator = new Calculations();
        assertEquals(4, calculator.difference(a, b));
    }

    @Test
    public void differenceShouldReturnNegNums() {
        int a = 10;
        int b = 15;
        Calculations calculator = new Calculations();
        assertEquals(-5, calculator.difference(a, b));
    }

    @DisplayName("Testing product() method")
    @Test
    public void productShouldReturnEight() {
        int a = 2;
        int b = 4;
        Calculations calculator = new Calculations();
        assertEquals(8, calculator.product(a, b));
    }

    @Test
    public void productShouldReturnEighty() {
        int a = 10;
        int b = 8;
        Calculations calculator = new Calculations();
        assertEquals(80, calculator.product(a, b));
    }

    @DisplayName("Testing quotient() method")
    @Test
    public void quotientShouldReturnFive() {
        int a = 50;
        int b = 10;
        Calculations calculator = new Calculations();
        assertEquals(5, calculator.quotient(a, b));
    }

    @Test
    public void quotientShouldReturnDecimal() {
        double a = 6.5;
        double b = 2;
        Calculations calculator = new Calculations();
        assertEquals(3.25, calculator.quotient(a, b));
    }

    @DisplayName("Testing modulus() method")
    @Test
    public void modulusShouldReturnZero() {
        int a = 6;
        int b = 3;
        Calculations calculator = new Calculations();
        assertEquals(0, calculator.modulus(a, b));
    }

    @Test
    public void modulusShouldReturnOne() {
        int a = 7;
        int b = 2;
        Calculations calculator = new Calculations();
        assertEquals(1, calculator.modulus(a, b));
    }

}