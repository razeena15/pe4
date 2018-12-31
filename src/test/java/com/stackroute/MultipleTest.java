package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleTest {
Multiple multiple=new Multiple();
@Test
 public void multipleCheck(){
    String result=multiple.search("She sells seashells by the seashore","se");
    assertEquals(4-6,result);
}
    @Test
    public void multipleCheck1(){
        String result=multiple.search("She sells seashells by the seashore","se");
        assertEquals(10-12,result);
    }
}