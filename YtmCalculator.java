/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classwork;

/**
 *
 * @author calvin
 */
public class YtmCalculator {
    public static double calculateYtm(double c, double f, double p, double n) {
        return (c + (f - p) / n) / ((f + p) / 2);
    }

    public static void main(String[] args) {
        double c = 100; // Annual coupon payment
        double f = 1000; // Face value of the bond
        double p = 900; // Market price of the bond
        double n = 5; // Number of years until maturity

        double ytm = calculateYtm(c, f, p, n);
        System.out.printf("Yield to Maturity: %.2f%%\n", ytm * 100);
    }
}


