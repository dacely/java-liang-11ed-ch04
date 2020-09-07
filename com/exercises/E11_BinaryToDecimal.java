package com.exercises;

import java.util.Scanner;

public class E11_BinaryToDecimal
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter binary digits (0000 to 1111): ");
        String binString = input.nextLine();
        int num = 0;
        num += (binString.charAt(0) - '0') * 8;
        num += (binString.charAt(1) - '0') * 4;
        num += (binString.charAt(2) - '0') * 2;
        num += (binString.charAt(3) - '0');
        System.out.printf("The decimal value of %s is %d", binString, num);
    }
}
