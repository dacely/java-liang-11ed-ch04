package com.listings;

import java.util.Scanner;

public class L05_LotteryUsingStrings
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two digits): ");
        String userPick = input.nextLine();

        if (userPick.length() == 1)
            userPick = "0" + userPick;

        if (userPick.length() > 2)
        {
            System.out.println("Invalid input");
            System.exit(1);
        }

        if (!(Character.isDigit(userPick.charAt(0)) && Character.isDigit(userPick.charAt(1))))
        {
            System.out.println("Invalid input");
            System.exit(1);
        }

        char ch0 = (char) (48 + (int) (Math.random() * 10));
        char ch1 = (char) (48 + (int) (Math.random() * 10));
        System.out.printf("The lottery number is %s\n", "" + ch0 + ch1);

        if (userPick.charAt(0) == ch0 && userPick.charAt(1) == ch1)
            System.out.println("Exact match: you win $10.000");
        else if (userPick.charAt(0) == ch1 && userPick.charAt(1) == ch0)
            System.out.println("Match all digits: you win $3.000");
        else if (userPick.charAt(0) == ch0 || userPick.charAt(0) == ch1
                    || userPick.charAt(1) == ch0 || userPick.charAt(1) == ch1)
            System.out.println("Match one digit: you win $1.000");
        else
            System.out.println("Sorry: no match");


    }
}
