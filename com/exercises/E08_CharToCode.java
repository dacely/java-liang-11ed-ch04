package com.exercises;

import java.util.Scanner;

public class E08_CharToCode
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = input.nextLine().charAt(0);
        System.out.printf("The Unicode code for %c is %d", ch, (int) ch);
    }
}
