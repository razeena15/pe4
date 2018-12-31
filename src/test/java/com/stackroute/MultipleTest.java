package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleTest
{
    Multiple multiple=new Multiple();
    @Test
    public void multipleCheck_1()
    {
        String sentence = "She sells seashells by the seashore";
        String word = "se";
        String expectedOutput = "Found at: 4 - 6\nFound at: 10 - 12\nFound at: 27 - 29";
        assertEquals(expectedOutput, Multiple.search(sentence, word));
    }

    @Test
    public void multipleCheck_2()
    {
        String sentence = "She sells seashells by the seashore";
        String word = "SE";
        String expectedOutput = "Not Found!";
        assertEquals(expectedOutput, Multiple.search(sentence, word));
    }

    @Test
    public void multipleCheck_3()
    {
        String sentence = "Nothing is True, Everything is Permitted.";
        String word = "True";
        String expectedOutput = "Found at: 11 - 15";
        assertEquals(expectedOutput, Multiple.search(sentence, word));
    }
}