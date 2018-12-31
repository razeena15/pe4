package com.stackroute;

import java.util.regex.Pattern;

public class PresenceOfHarry
{
    public static boolean checkPresence(String sentence, String name)
    {
        return Pattern.compile(name).matcher(sentence).find();
    }
}