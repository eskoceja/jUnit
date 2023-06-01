package com.ctac.testing;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class HiFriendTest {

    @DisplayName("Test hiFriend() method")
    @Test
    public void testHiFriend() {
        HiFriend friend = new HiFriend();
        String name = "Bubbles Bubblegum";
        assertEquals("Hi Bubbles Bubblegum!", friend.hiFriend(name));

    }

    @DisplayName("Making hiFriend() run an error")
    @Test
    public void testHiFriendForFail() {
        HiFriend friend = new HiFriend();
        String name = "Bubbles Bubblegum";
        assertNotEquals(name, friend.hiFriend(name));
    }

}