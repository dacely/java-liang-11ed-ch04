package com.exercises;

import java.util.Scanner;

public class E24_ThreeCountries
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first country: ");
        String country1 = input.nextLine();
        System.out.print("Enter the second country: ");
        String country2 = input.nextLine();
        System.out.print("Enter the third country: ");
        String country3 = input.nextLine();
        String first;
        String second;
        String third;

        if (country1.compareToIgnoreCase(country2) < 0)
        {
            first = country1;
            second = country2;
        }
        else
        {
            first = country2;
            second = country1;
        }

        if (country3.compareToIgnoreCase(first) < 0)
        {
            third = second;
            second = first;
            first = country3;
        }
        else if (country3.compareToIgnoreCase(second) < 0)
        {
            third = second;
            second = country3;
        }
        else
        {
            third = country3;
        }

        System.out.println("The three countries in descending order are:");
        System.out.println("\t" + third);
        System.out.println("\t" + second);
        System.out.println("\t" + first);
    }
}
