package com.exercises;

import java.util.Scanner;

public class E10_GuessBirthday
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String set1 =
                " 1  3  5  7\n" +
                        " 9 11 13 15\n" +
                        "17 19 21 23\n" +
                        "25 27 29 31";
        String set2 =
                " 2  3  6  7\n" +
                        "10 11 14 15\n" +
                        "18 19 22 23\n" +
                        "26 27 30 31";
        String set3 =
                " 4  5  6  7\n" +
                        "12 13 14 15\n" +
                        "20 21 22 23\n" +
                        "28 29 30 31";
        String set4 =
                " 8  9 10 11\n" +
                        "12 13 14 15\n" +
                        "24 25 26 27\n" +
                        "28 29 30 31";
        String set5 =
                "16 17 18 19\n" +
                        "20 21 22 23\n" +
                        "24 25 26 27\n" +
                        "28 29 30 31";

        String answer;
        int day = 0;

        System.out.printf("Is your birthday this set?\n%s\n", set1);
        System.out.print("Yes/No: ");
        answer = input.nextLine().toLowerCase();
        if (answer.equals("y") || answer.equals("yes") )
            day += 1;

        System.out.printf("Is your birthday this set?\n%s\n", set2);
        System.out.print("Yes/No: ");
        answer = input.nextLine().toLowerCase();
        if (answer.equals("y") || answer.equals("yes") )
            day += 2;

        System.out.printf("Is your birthday this set?\n%s\n", set3);
        System.out.print("Yes/No: ");
        answer = input.nextLine().toLowerCase();
        if (answer.equals("y") || answer.equals("yes") )
            day += 4;

        System.out.printf("Is your birthday this set?\n%s\n", set4);
        System.out.print("Yes/No: ");
        answer = input.nextLine().toLowerCase();
        if (answer.equals("y") || answer.equals("yes") )
            day += 8;

        System.out.printf("Is your birthday this set?\n%s\n", set5);
        System.out.print("Yes/No: ");
        answer = input.nextLine().toLowerCase();
        if (answer.equals("y") || answer.equals("yes") )
            day += 16;

        System.out.printf("Your birthday is %d", day);
    }
}
