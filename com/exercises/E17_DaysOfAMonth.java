package com.exercises;

import java.util.Scanner;

public class E17_DaysOfAMonth
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        input.nextLine();
        System.out.print("Enter a month (three letters e.g., Jan): ");
        String month = input.nextLine();
        month = month.toLowerCase();
        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);

        switch (month)
        {
            case "jan":
                System.out.printf("January %d has 31 days", year);
                break;
            case "feb":
                System.out.printf("February %d has %d days", year, isLeapYear ? 29 : 28);
                break;
            case "mar":
                System.out.printf("March %d has 31 days", year);
                break;
            case "apr":
                System.out.printf("April %d has 30 days", year);
                break;
            case "may":
                System.out.printf("May %d has 31 days", year);
                break;
            case "jun":
                System.out.printf("June %d has 30 days", year);
                break;
            case "jul":
                System.out.printf("July %d has 31 days", year);
                break;
            case "aug":
                System.out.printf("August %d has 31 days", year);
                break;
            case "sep":
                System.out.printf("September %d has 30 days", year);
                break;
            case "oct":
                System.out.printf("October %d has 31 days", year);
                break;
            case "nov":
                System.out.printf("November %d has 30 days", year);
                break;
            case "dec":
                System.out.printf("December %d has 31 days", year);
                break;
            default:
                System.out.println("Invalid Input");
                System.exit(1);
        }
    }
}
