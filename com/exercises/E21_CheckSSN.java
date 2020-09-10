package com.exercises;

import java.util.Scanner;

public class E21_CheckSSN
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a SSN: ");
        String str1 = input.nextLine();
        boolean isValid = str1.length() == 11;
        isValid = isValid && Character.isDigit(str1.charAt(0));
        isValid = isValid && Character.isDigit(str1.charAt(1));
        isValid = isValid && Character.isDigit(str1.charAt(2));
        isValid = isValid && str1.charAt(3) == '-';
        isValid = isValid && Character.isDigit(str1.charAt(4));
        isValid = isValid && Character.isDigit(str1.charAt(5));
        isValid = isValid && str1.charAt(6) == '-';
        isValid = isValid && Character.isDigit(str1.charAt(7));
        isValid = isValid && Character.isDigit(str1.charAt(8));
        isValid = isValid && Character.isDigit(str1.charAt(9));
        isValid = isValid && Character.isDigit(str1.charAt(10));

        if (isValid)
            System.out.println(str1 + " is a valid social security number");
        else
            System.out.println(str1 + " is not an invalid social security number");
    }
}
