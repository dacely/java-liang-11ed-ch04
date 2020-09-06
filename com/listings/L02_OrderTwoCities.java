package com.listings;

import java.util.Scanner;

public class L02_OrderTwoCities
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first city: ");
        String city1 = input.nextLine();
        System.out.print("Enter the second city: ");
        String city2 = input.nextLine();

        if (city1.compareToIgnoreCase(city2) < 0)
            System.out.printf("The cities in alphabetical order are %s, %s", city1, city2);
        else
            System.out.printf("The cities in alphabetical order are %s, %s", city2, city1);
    }
}
