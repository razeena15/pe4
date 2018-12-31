package com.stackroute;

import java.util.*;


public class Occurence
{
   public int count(String s,char c) {

            String str = s.toLowerCase();
            c = str.toLowerCase().charAt(0);
            int cn = str.length() - str.replaceAll(String.valueOf(c), "").length();
            System.out.println(c + " occurs " + cn + " times in:\n " + str);
            return cn;
        }

    }

