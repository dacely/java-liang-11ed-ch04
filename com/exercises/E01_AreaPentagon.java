package com.exercises;

import java.util.Scanner;

public class E01_AreaPentagon
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length for the center to a vertex: ");
        double r = input.nextDouble();
        double s = 2 * r * Math.sin(Math.PI / 5);
        double A = (5 * s * s) / (4 * Math.tan(Math.PI / 5));
        System.out.printf("The area of the pentagon is %.2f", A);
    }
}
