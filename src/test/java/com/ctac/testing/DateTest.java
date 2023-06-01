package com.ctac.testing;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DateTest {

    @Test
    public void shouldReturnZeroWeAreFugly() {
        Date date = new Date();
        int me = 2;
        int you = 2;
        assertEquals(0, date.dateFashion(me, you));
    }

    @Test
    public void shouldReturnOneILookOkay() {
        Date date = new Date();
        int me = 6;
        int you = 3;
        assertEquals(1, date.dateFashion(me, you));
    }

    @Test
    public void shouldReturnOneDateLooksOkay() {
        Date date = new Date();
        int me = 4;
        int you = 7;
        assertEquals(1, date.dateFashion(me, you));
    }

    @Test
    public void shouldReturnTwoWeLookGood() {
        Date date = new Date();
        int me = 8;
        int you = 9;
        assertEquals(2, date.dateFashion(me, you));
    }

}