package com.exercises;

import java.util.Scanner;

public class E23_Payroll
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee’s name: ");
        String employeeName = input.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        double hoursWorked = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double hourlyPayRate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double federalTax = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double stateTax = input.nextDouble();
        double grossPay = hourlyPayRate * hoursWorked;
        double federalWithholding = grossPay * federalTax;
        double stateWithholding = grossPay * stateTax;
        double totalDeduction = federalWithholding + stateWithholding;
        double netPay = grossPay - totalDeduction;

        System.out.printf("Employee Name: %s\n", employeeName);
        System.out.printf("Hours Worked: %.1f\n", hoursWorked);
        System.out.printf("Pay Rate: $%.2f\n", hourlyPayRate);
        System.out.printf("Gross Pay: $%.2f\n", grossPay);
        System.out.println("Deductions: ");
        System.out.printf("\tFederal Withholding (%.1f): $%.2f\n", federalTax, federalWithholding);
        System.out.printf("\tState Withholding (%.1f): $%.2f\n", stateTax, stateWithholding);
        System.out.printf("\tTotal Deduction: $%.2f\n", totalDeduction);
        System.out.printf("Net Pay: $%.2f\n", netPay);
    }
}
