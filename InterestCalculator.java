/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classwork;

/**
 *
 * @author calvin
 */
import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Loan: ");
        double loan = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        // Calculation of Simple Interest
        double simpleInterest = (loan * rate * time) / 100;

        // Calculation of Compound Interest
        double compoundInterest = loan * Math.pow((1 + rate/100), time) - loan;

        System.out.printf("Simple Interest: %.2f\n", simpleInterest);
        System.out.printf("Compound Interest: %.2f\n", compoundInterest);
    }
}

