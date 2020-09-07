package com.exercises;

public class E03_EstimateArea
{
    public static void main(String[] args)
    {
        double charlotte_x = 35.2270869;
        double charlotte_y = -80.8431267;
        double savannah_x = 32.0835407;
        double savannah_y = -81.0998342;
        double orlando_x = 28.5383355;
        double orlando_y = -81.3792365;
        double atlanta_x = 33.7489954;
        double atlanta_y = -84.3879824;

        double a = 0;
        double b = 0;
        double c = 0;
        double s = 0;

        // Distance Charlotte - Savannah
        a = Math.sin(Math.toRadians(charlotte_x)) * Math.sin(Math.toRadians(savannah_x));
        b = Math.cos(Math.toRadians(charlotte_x)) * Math.cos(Math.toRadians(savannah_x));
        c = Math.cos(Math.toRadians(charlotte_y - savannah_y));
        double d1 = 6371.01 * Math.acos(a + b * c);

        // Distance Orlando - Savannah
        a = Math.sin(Math.toRadians(orlando_x)) * Math.sin(Math.toRadians(savannah_x));
        b = Math.cos(Math.toRadians(orlando_x)) * Math.cos(Math.toRadians(savannah_x));
        c = Math.cos(Math.toRadians(orlando_y - savannah_y));
        double d2 = 6371.01 * Math.acos(a + b * c);

        // Distance Charlotte - Orlando
        a = Math.sin(Math.toRadians(charlotte_x)) * Math.sin(Math.toRadians(orlando_x));
        b = Math.cos(Math.toRadians(charlotte_x)) * Math.cos(Math.toRadians(orlando_x));
        c = Math.cos(Math.toRadians(charlotte_y - orlando_y));
        double d3 = 6371.01 * Math.acos(a + b * c);

        // Distance Charlotte - Atlanta
        a = Math.sin(Math.toRadians(charlotte_x)) * Math.sin(Math.toRadians(atlanta_x));
        b = Math.cos(Math.toRadians(charlotte_x)) * Math.cos(Math.toRadians(atlanta_x));
        c = Math.cos(Math.toRadians(charlotte_y - atlanta_y));
        double d4 = 6371.01 * Math.acos(a + b * c);

        // Distance Atlanta - Orlando
        a = Math.sin(Math.toRadians(atlanta_x)) * Math.sin(Math.toRadians(orlando_x));
        b = Math.cos(Math.toRadians(atlanta_x)) * Math.cos(Math.toRadians(orlando_x));
        c = Math.cos(Math.toRadians(atlanta_y - orlando_y));
        double d5 = 6371.01 * Math.acos(a + b * c);

        // Area Charlotte-Savannah-Orlando
        s = (d1 + d2 + d3) / 2;
        double area1 = Math.sqrt(s * (s - d1) * (s - d2) * (s - d3));

        // Area Charlotte-Atlanta-Orlando
        s = (d3 + d4 + d5) / 2;
        double area2 = Math.sqrt(s * (s - d3) * (s - d4) * (s - d5));

        System.out.printf("Estimate area: %,.2f km2", area1 + area2);
    }
}
