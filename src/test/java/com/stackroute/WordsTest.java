package com.stackroute;

import org.graalvm.compiler.word.Word;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordsTest {

    Words a1;
    @Before
    public void setUp() throws Exception {
        a1=new Words();
    }

    @After
    public void tearDown() throws Exception {
        a1=null;
    }

    @Test
    public void sortWords() {
        String[] str={"aih, ihst is acekorsttu"};
        String[] str1={"hai, this is stackroute"};
        assertArrayEquals(str,Words.sortWords(str1));
    }
}