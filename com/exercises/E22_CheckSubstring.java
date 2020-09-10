package com.exercises;

import java.util.Scanner;

public class E22_CheckSubstring
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string s1: ");
        String str1 = input.nextLine();
        System.out.print("Enter string s2: ");
        String str2 = input.nextLine();

        if (str1.contains(str2))
            System.out.println(str2 + " is a substring of " + str1);
        else
            System.out.println(str2 + " is not a substring of " + str1);

    }
}
