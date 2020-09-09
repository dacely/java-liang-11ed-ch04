package com.exercises;

import java.util.Scanner;

public class E13_VowelOrConsonant
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String str1 = input.nextLine();

        if (str1.length() > 1)
        {
            System.out.println("Invalid input");
            System.exit(1);
        }

        char ch1 = str1.toUpperCase().charAt(0);

        if (ch1 >= 'A' && ch1 <= 'Z')
        {
            switch (ch1)
            {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                   System.out.printf("%s is a vowel", str1);
                   break;
                default:
                   System.out.printf("%s is a consonant", str1);
            }
        }
        else
        {
            System.out.println("Invalid input");
            System.exit(1);
        }
    }
}
