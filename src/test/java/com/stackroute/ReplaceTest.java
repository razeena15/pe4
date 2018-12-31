package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceTest {

    Replace r=new Replace();

    @Test
    public void replaceWord()
    {
        String result=r.replaceWord("daily dry");
        assertEquals("The expected answer is","faity fry",result);
    }

}