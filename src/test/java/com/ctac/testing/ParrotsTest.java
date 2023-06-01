package com.ctac.testing;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ParrotsTest {

    @Test
    public void shouldReturnTrueForTalkingAfterHrs() {
        Parrots parrot = new Parrots();
        boolean talking = true;
        int hour = 21;
        assertTrue(parrot.parrotTrouble(talking, hour));
    }
    @Test
    public void shouldReturnFalseForNotTalkingAfterHrs() {
        Parrots parrot = new Parrots();
        boolean talking = true;
        int hour = 14;
        assertFalse(parrot.parrotTrouble(talking, hour));
    }
    @Test
    public void shouldReturnTrueForTalkingBeforeHrs() {
        Parrots parrot = new Parrots();
        boolean talking = true;
        int hour = 6;
        assertTrue(parrot.parrotTrouble(talking, hour));
    }

}