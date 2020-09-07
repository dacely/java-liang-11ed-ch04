package com.exercises;

public class E06_RandomPointsInCircle
{
    public static void main(String[] args)
    {
        double alpha1 = Math.random() * 2 * Math.PI;
        double alpha2 = Math.random() * 2 * Math.PI;
        double alpha3 = Math.random() * 2 * Math.PI;

        double x1 = 40 * Math.cos(alpha1);
        double y1 = 40 * Math.sin(alpha1);
        double x2 = 40 * Math.cos(alpha2);
        double y2 = 40 * Math.sin(alpha2);
        double x3 = 40 * Math.cos(alpha3);
        double y3 = 40 * Math.sin(alpha3);

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
