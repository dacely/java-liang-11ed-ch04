package com.exercises;

import java.util.Scanner;

public class E07_PentagonCoordinates
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the bounding circle: ");
        double r = input.nextDouble();
        double x1 = r * Math.cos(Math.toRadians(18));
        double y1 = r * Math.sin(Math.toRadians(18));
        double x2 = 0;
        double y2 = r;
        double x3 = r * Math.cos(Math.toRadians(162));
        double y3 = r * Math.sin(Math.toRadians(162));
        double x4 = r * Math.cos(Math.toRadians(234));
        double y4 = r * Math.sin(Math.toRadians(234));
        double x5 = r * Math.cos(Math.toRadians(306));
        double y5 = r * Math.sin(Math.toRadians(306));
        System.out.println("The coordinates of the five points on the pentagon are: ");
        System.out.printf("(%6.2f, %6.2f)\n", x1, y1);
        System.out.printf("(%6.2f, %6.2f)\n", x2, y2);
        System.out.printf("(%6.2f, %6.2f)\n", x3, y3);
        System.out.printf("(%6.2f, %6.2f)\n", x4, y4);
        System.out.printf("(%6.2f, %6.2f)\n", x5, y5);
    }
}
