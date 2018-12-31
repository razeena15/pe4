package com.stackroute;

import java.util.regex.Pattern;

public class Multiple
{

    public static String search(String sentence, String word)
    {
        boolean isFirstLine = true;
        StringBuffer sb = new StringBuffer();
        int index = 0;
        for(;index<sentence.length()-word.length();index++)
        {
            if(Pattern.compile(sentence.substring(index, index+word.length())).matcher(word).matches() && isFirstLine)
            {
                sb.append("Found at: " + index + " - " + (index + word.length()));
                isFirstLine = false;
            }
            else if(Pattern.compile(sentence.substring(index, index+word.length())).matcher(word).matches() && !isFirstLine)
                sb.append("\nFound at: " + index + " - " + (index + word.length()));
        }
        if(sb.toString().isEmpty())
        {
            sb.append("Not Found!");
        }
        return sb.toString();
    }
}