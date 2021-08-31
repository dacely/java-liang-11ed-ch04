package com.exercises;

import java.util.Locale;
import java.util.Scanner;

public class E08_CharToCode
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = input.nextLine().charAt(0);

        System.out.println("Method 1: ");
        int dec = (int) ch;
        System.out.printf("Dec: %d\n", (int) ch);
        System.out.printf("Hex: %X\n", (int) ch);

        System.out.println();
        System.out.println("Method 2: ");
        System.out.println( "Hex: " + Integer
                .toHexString(ch | 0x10000)
                .substring(1)
                .toUpperCase());
    }
}
