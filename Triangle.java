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

public class Triangle {
    private double ac; // length of hypotenuse
    
    public Triangle(double ac) {
        this.ac = ac;
    }
    
    public double calculateDistanceAB(double bc) {
        double ab = Math.sqrt(Math.pow(ac, 2) - Math.pow(bc, 2)); // calculate length of missing side using Pythagorean theorem
        return ab;
    }
    
    public double calculateTime(double distance) {
        double walkingSpeed = 10; // speed of person in m/hour
        double time = distance / walkingSpeed; // calculate time using formula
        return time;
    }
    
    public static void main(String[] args) {
        Triangle triangle = new Triangle(97); // create Triangle object with length of hypotenuse 97
        double bc = 72; // distance from point B to point C in meters
        double distanceAB = triangle.calculateDistanceAB(bc); // calculate distance from point A to point B
        double timeTaken = triangle.calculateTime(distanceAB); // calculate time taken to travel from point A to point B
        System.out.println("Distance from point A to point B: " + distanceAB + "m");
        System.out.println("Time taken to travel from point A to point B: " + timeTaken + " hours");
    }
}


