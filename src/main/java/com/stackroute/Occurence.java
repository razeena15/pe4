package com.stackroute;

import java.util.*;

public class Occurence
{
    public int count(String s,char c) {

            String str = s.toLowerCase();
            System.out.println("Enter a character to count in the string " + s);
            c = s.toLowerCase().charAt(0); // This logic is to read
            // only one character
            int cn = s.length() - s.replaceAll(String.valueOf(c), "").length();
            System.out.println(c + " occurs " + cn + " times in " + s);
            return cn;
        }
    }

