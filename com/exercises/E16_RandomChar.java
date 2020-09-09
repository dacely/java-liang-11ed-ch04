package com.exercises;

public class E16_RandomChar
{
    public static void main(String[] args)
    {
        int num1 = (int) (Math.random() * 25) + 97;
        char ch1 = (char) num1;
        int up = (int) (Math.random() * 2);
        if (up == 1)
            System.out.print(Character.toUpperCase(ch1));
        else
            System.out.print(ch1);
    }
}
