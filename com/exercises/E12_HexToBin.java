package com.exercises;

import java.util.Scanner;

public class E12_HexToBin
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex digit: ");
        String str1 = input.nextLine();

        if (str1.length() > 1)
        {
            System.out.println("Invalid input");
            System.exit(1);
        }

        int n1 = str1.toUpperCase().charAt(0);
        if (n1 >= 65 && n1 <= 70)
            System.out.printf("The binary value is %d", n1 - 55);
        else if (n1 >= 48 && n1 <= 57)
            System.out.printf("The binary value is %d", n1 - 48);
        else
        {
            System.out.println("Invalid input");
            System.exit(1);
        }
    }
}
