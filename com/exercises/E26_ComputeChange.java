package com.exercises;

import java.util.Scanner;

public class E26_ComputeChange
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount of money, for example 11.56: ");
        String str1 = input.nextLine();
        int dollars = Integer.parseInt(str1.substring(0, str1.indexOf(',')));
        int cents = Integer.parseInt(str1.substring(str1.indexOf(',') + 1));

        int quarters = cents / 25;
        int dimes = (cents % 25) / 10;
        int nickels = ((cents % 25) % 10) / 5;
        int pennies = ((cents % 25) % 10) % 5;

        if (dollars > 0)
            if (dollars == 1)
                System.out.print("\t 1 dollar \n");
            else
                System.out.printf("\t %d dollars \n", dollars);

        if (quarters > 0)
            if (quarters == 1)
                System.out.print("\t 1 quarter \n");
            else
                System.out.printf("\t %d quarters \n", quarters);

        if (dimes > 0)
            if (dimes == 1)
                System.out.print("\t 1 dime \n");
            else
                System.out.printf("\t %d dimes \n", dimes);

        if (nickels == 1)
            System.out.print("\t 1 nickel \n");

        if (pennies > 0)
            if (pennies == 1)
                System.out.print("\t 1 penny \n");
            else
                System.out.printf("\t %d pennies \n", pennies);
    }
}
