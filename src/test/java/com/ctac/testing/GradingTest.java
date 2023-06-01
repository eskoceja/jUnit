package com.ctac.testing;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GradingTest {
    @Test
    public void zeroShouldReturnF() {
        Grading grade = new Grading();
        assertEquals('F', grade.determineLetterGrade(0));
    }

    @Test
    public void fiftyNineShouldReturnF() {
        Grading grade = new Grading();
        assertEquals('F', grade.determineLetterGrade(59));
    }

    @Test
    public void sixtyNineShouldReturnD() {
        Grading grade = new Grading();
        assertEquals('D', grade.determineLetterGrade(69));
    }

    @Test
    public void seventyNineShouldReturnC() {
        Grading grade = new Grading();
        assertEquals('C', grade.determineLetterGrade(79));
    }

    @Test
    public void eightyNineShouldReturnB() {
        Grading grade = new Grading();
        assertEquals('B', grade.determineLetterGrade(89));
    }

    @Test
    public void ninetyNineShouldReturnA() {
        Grading grade = new Grading();
        assertEquals('A', grade.determineLetterGrade(99));
    }

    @Test
    public void negOneShouldReturnIllegalArgumentException() {
        Grading grade = new Grading();
        assertThrows(IllegalArgumentException.class,
                () -> grade.determineLetterGrade(-1));
    }

    @Test
    public void oneOhOneShouldReturnIllegalArgumentException() {
        Grading grade = new Grading();
        assertThrows(IllegalArgumentException.class,
                () -> grade.determineLetterGrade(101));
    }
    @Test
    public void minValidValueShouldReturnD() {
        Grading grade = new Grading();
        assertEquals('D', grade.determineLetterGrade(60));
    }

    @Test
    public void maxValidValueShouldReturnA() {
        Grading grade = new Grading();
        assertEquals('A', grade.determineLetterGrade(100));
    }
    @Test
    public void eightyShouldReturnB() {
        Grading grade = new Grading();
        assertEquals('B', grade.determineLetterGrade(80));
    }

    @Test
    public void seventyShouldReturnC() {
        Grading grade = new Grading();
        assertEquals('C', grade.determineLetterGrade(70));
    }
}