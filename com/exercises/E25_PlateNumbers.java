package com.exercises;

public class E25_PlateNumbers
{
    public static void main(String[] args)
    {
        char ch1 = (char) ((int) (Math.random() * ('Z' - 'A' + 1)) + 'A');
        char ch2 = (char) ((int) (Math.random() * ('Z' - 'A' + 1)) + 'A');
        char ch3 = (char) ((int) (Math.random() * ('Z' - 'A' + 1)) + 'A');
        int num = (int) (Math.random() * 10_000);

        System.out.printf("%c%c%c-%04d", ch1, ch2, ch3, num);
    }
}
