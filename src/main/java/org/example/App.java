/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Austin Mathew
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        int legalAge = 16;
        System.out.print( "What is your age? " );
        int age = input.nextInt();

        System.out.println("You are " + (age >= legalAge ? "" : "not ") + "old enough to legally drive.");

    }
}
