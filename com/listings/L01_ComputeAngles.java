package com.listings;

import java.util.Scanner;

public class L01_ComputeAngles
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter point 1 (x1 y1): ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.print("Enter point 2 (x2 y2): ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        System.out.print("Enter point 3 (x3 y3): ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        double a = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
        double b = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        double c = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        double A = Math.acos((a * a - b * b - c * c) / (-2 * b * c));
        double B = Math.acos((b * b - a * a - c * c) / (-2 * a * c));
        double C = Math.acos((c * c - b * b - a * a) / (-2 * a * b));

        System.out.printf("The angle at point 1 is: %.2f \n", Math.toDegrees(A));
        System.out.printf("The angle at point 2 is: %.2f \n", Math.toDegrees(B));
        System.out.printf("The angle at point 3 is: %.2f \n", Math.toDegrees(C));
    }
}
