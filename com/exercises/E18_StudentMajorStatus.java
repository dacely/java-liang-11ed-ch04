package com.exercises;

import java.util.Scanner;

public class E18_StudentMajorStatus
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two characters: ");
        String str1 = input.nextLine();

        if (str1.length() != 2)
        {
            System.out.println("Invalid Input");
            System.exit(1);
        }

        char ch0 = str1.charAt(0);
        char ch1 = str1.charAt(1);

        switch (ch0)
        {
            case 'I':
                System.out.print("Information Management ");
                break;
            case 'C':
                System.out.print("Computer Science ");
                break;
            case 'A':
                System.out.print("Accounting ");
                break;
            default:
                System.out.println("Invalid Input");
                System.exit(1);
                break;
        }

        switch (ch1)
        {
            case '1':
                System.out.print("Freshman");
                break;
            case '2':
                System.out.print("Sophomore");
                break;
            case '3':
                System.out.print("Junior");
                break;
            case '4':
                System.out.print("Senior");
                break;
            default:
                System.out.println("\nInvalid Input");
                System.exit(1);
                break;
        }
    }
}
