package com.stackroute;

import java.util.Scanner;

public class Words {
    public static String[] sortWords(String input) {
        int i, j;
        String temp;
        //Scanner scan = new Scanner(System.in);

        //String names;


        //System.out.println("Enter your string");
        //names = scan.nextLine();
        String splitnames[] = new String[input.length()];
        splitnames = input.toLowerCase().split(" ");

        System.out.println("\nSorting Words in Alphabetical Order...\n");
        for (i = 0; i < splitnames.length; i++) {
            for (j = 1; j < splitnames.length; j++) {
                if ((splitnames[j - 1].compareTo(splitnames[j])) > 0) {
                    temp = splitnames[j - 1];
                    splitnames[j - 1] = splitnames[j];
                    splitnames[j] = temp;
                }
            }
        }

        return splitnames;

        //System.out.print("Words/Names Sorted in Alphabetical Order Successfully..!!");

        //System.out.println("\nNow the List is :\n");
        //for (i = 0; i < splitnames.length; i++) {
        //    System.out.println(splitnames[i]);
        }
    }
