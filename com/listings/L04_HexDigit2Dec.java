package com.listings;

import java.util.Scanner;

public class L04_HexDigit2Dec
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hex digit: ");
        String hexStr = input.nextLine();

        if (hexStr.length() > 1)
        {
            System.out.println("You must enter exactly one character");
            System.exit(1);
        }

        char hexChar = hexStr.toUpperCase().charAt(0);
        if (hexChar >= 'A' && (int) hexChar <= 'F')
        {
            int value = hexChar - 'A' + 10;
            System.out.printf("The decimal value for hex digit %c is %d", hexChar, value);
        }
        else if (Character.isDigit(hexChar))
            System.out.printf("The decimal value for hex digit %1$c is %1$c", hexChar);
        else
            System.out.printf("%c is not a valid input", hexChar);
    }
}
