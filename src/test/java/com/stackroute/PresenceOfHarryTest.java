package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PresenceOfHarryTest
{
    private final String NAME = "Harry";

    @Test
    public void checkPresence_1()
    {
        String sentence = "This is Harry.";

        assertTrue(PresenceOfHarry.checkPresence(sentence, NAME));
    }

    @Test
    public void checkPresence_2()
    {
        String sentence = "Is Harry here ?";

        assertTrue(PresenceOfHarry.checkPresence(sentence, NAME));
    }

    @Test
    public void checkPresence_3()
    {
        String sentence = "This is Henry.";

        assertFalse(PresenceOfHarry.checkPresence(sentence, NAME));
    }
}