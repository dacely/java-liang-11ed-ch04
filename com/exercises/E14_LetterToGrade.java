package com.exercises;

import java.util.Scanner;

public class E14_LetterToGrade
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter grade: ");
        String str1 = input.nextLine();

        if (str1.length() > 1)
        {
            System.out.print("Invalid Input");
            System.exit(1);
        }

        char ch1 = str1.toUpperCase().charAt(0);
        switch (ch1)
        {
            case 'A':
                System.out.printf("The numeric value for grade A is 4");
                break;
            case 'B':
                System.out.printf("The numeric value for grade B is 3");
                break;
            case 'C':
                System.out.printf("The numeric value for grade C is 2");
                break;
            case 'D':
                System.out.printf("The numeric value for grade D is 1");
                break;
            case 'F':
                System.out.printf("The numeric value for grade F is 0");
                break;
            default:
                System.out.print("Invalid Input");
                break;
        }
    }
}
