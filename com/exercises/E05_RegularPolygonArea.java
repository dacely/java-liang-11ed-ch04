package com.exercises;

import java.util.Scanner;

public class E05_RegularPolygonArea
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        double n = input.nextDouble();
        System.out.print("Enter the length of the side: ");
        double s = input.nextDouble();
        double area = (n * s * s) / (4 * Math.tan(Math.PI / n));
        System.out.printf("The area of the hexagon is %.2f\n", area);
    }
}
