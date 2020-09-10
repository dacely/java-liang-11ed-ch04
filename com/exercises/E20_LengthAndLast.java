package com.exercises;

import java.util.Scanner;

public class E20_LengthAndLast
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str1 = input. nextLine();
        System.out.printf("Length: %d\n", str1.length());
        System.out.printf("Last character: %c", str1.charAt(str1.length() - 1));
    }
}
