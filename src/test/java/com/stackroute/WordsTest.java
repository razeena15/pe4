package com.stackroute;

//import org.graalvm.compiler.word.Word;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordsTest {

    Words words;
    @Before
    public void setUp() throws Exception {
        words=new Words();
    }

    @After
    public void tearDown() throws Exception {
        words=null;
    }

    @Test
    public void sortWordsOne() {
        String s = "elephant is a animal";

        String[] str = {"a", "animal", "elephant", "is"};

        String[] str1=words.sortWords(s);

        assertArrayEquals(str, str1);
    }
}