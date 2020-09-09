package com.exercises;

import java.util.Scanner;

public class E15_PhoneKeyPads
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String str1 = input.nextLine();

        if (str1.length() > 1)
        {
            System.out.print("Invalid Input");
            System.exit(1);
        }
        int key = 0;

        char ch1 = str1.toUpperCase().charAt(0);
        if (ch1 >= 'A' && ch1 <= 'R')
        {
            key = ((ch1 - 'A') / 3) + 2;
            System.out.printf("The corresponding number is %d", key);
        }
        else if (ch1 >= 'S' && ch1 <= 'Y')
        {
            ch1 -= 1;
            key = ((ch1 - 'A') / 3) + 2;
            System.out.printf("The corresponding number is %d", key);
        }
        else if (ch1 == 'Z')
            System.out.printf("The corresponding number is %d", 9);
        else
        {
            System.out.print("Invalid Input");
            System.exit(1);
        }
    }
}
