package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;

public class OccurenceTest {
    Occurence occur = new Occurence();
    @Test
    public void counting()
    {

        int res =occur.count("Java is java again java again count number of java occurrence of a in the given string",'j');
        assertEquals(4,res);


    }
    @Test
    public void counting1()
    {

        int res =occur.count("Java is java again java again count number of  string",'j');
        assertEquals(3,res);


    }


}