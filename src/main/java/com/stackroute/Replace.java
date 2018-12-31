package com.stackroute;

public class Replace {
    public String replaceWord(String str)
    {


        // Replace all the 'd' characters with 'f' characters.
        String new_str = str.replace('d', 'f');
        String new_str1 = new_str.replace('l', 't');

        // Display the strings for comparison.
        System.out.println("Original string: " + str);
        System.out.println("New String: " + new_str1);
        return new_str1;
    }
}
