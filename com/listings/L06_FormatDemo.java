package com.listings;

public class L06_FormatDemo
{
    public static void main(String[] args)
    {
        System.out.printf("%10s", "Degrees");
        System.out.printf("%10s", "Radian");
        System.out.printf("%10s", "Sine");
        System.out.printf("%10s", "Cosine");
        System.out.printf("%10s", "Tangent");
        System.out.println();

        int angleDeg = 30;
        double angleRad = Math.toRadians(angleDeg);
        System.out.printf("%10d", angleDeg);
        System.out.printf("%10.4f", angleRad);
        System.out.printf("%10.4f", Math.sin(angleRad));
        System.out.printf("%10.4f", Math.cos(angleRad));
        System.out.printf("%10.4f", Math.tan(angleRad));
        System.out.println();

        angleDeg = 60;
        angleRad = Math.toRadians(angleDeg);
        System.out.printf("%10d", angleDeg);
        System.out.printf("%10.4f", angleRad);
        System.out.printf("%10.4f", Math.sin(angleRad));
        System.out.printf("%10.4f", Math.cos(angleRad));
        System.out.printf("%10.4f", Math.tan(angleRad));
        System.out.println();
    }
}
