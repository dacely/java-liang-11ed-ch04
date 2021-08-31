package com.exercises;

public class E09_CodeToChar
{
    public static void main(String[] args)
    {
        for (int i = 41; i < 65535; i++)
        {
            char ch = (char)i;
            System.out.printf("%3c", ch);

            if (i % 20 == 0)
            {
                System.out.println();
                System.out.printf("  %04X\u2506", i+1);
            }
        }
    }
}
