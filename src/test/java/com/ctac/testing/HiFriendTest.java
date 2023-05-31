package com.ctac.testing;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class HiFriendTest {

    @DisplayName("Test hiFriend() method")
    @Test
    public void testHiFriend() {
        assertEquals("Hi Bubbles Bubblegum!", HiFriend.hiFriend("Bubbles Bubblegum"));

    }

}