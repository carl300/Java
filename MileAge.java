/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classwork;

import java.util.Scanner;

/**
 *
 * @author calvin
 */
class Vehicle {
    int fuelCapacity; // capacity of the fuel tank in litres
    
    Vehicle(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }
    
    double getMileage(int distance) {
        return distance / fuelCapacity; // calculate mileage in km/litre
    }
}

class Car extends Vehicle {
    int distanceTravelled; // distance travelled in kilometers
    double gasPrice; // price of gas in dollars per litre
    
    Car(int fuelCapacity, int distanceTravelled, double gasPrice) {
        super(fuelCapacity);
        this.distanceTravelled = distanceTravelled;
        this.gasPrice = gasPrice;
    }
    
    double getMileage() {
        return super.getMileage(distanceTravelled); // call parent class method
    }
    
    double getCost() {
        return gasPrice * fuelCapacity; // calculate cost of gas to fill the tank
    }
    
    double getCostPerKm() {
        return gasPrice / getMileage(); // calculate cost per km travelled
    }
}

public class MileAge {
    public static void main(String[] args) {
        int fuel, distance, price;
         Scanner input = new Scanner(System.in);

        System.out.print("Enter the fuel capacity: ");
        fuel = input.nextInt();
        System.out.print("Enter the distance travelled: ");
        distance = input.nextInt();
        System.out.print("Enter the gas price: ");
        price = input.nextInt();
        Car myCar = new Car(fuel, distance, price); // fuel tank capacity = 50 litres, distance travelled = 500 km, gas price = $1.5 per litre
        double mileage = myCar.getMileage(); // get mileage in km/litre
        double cost = myCar.getCost(); // get cost of gas to fill the tank
        double costPerKm = myCar.getCostPerKm(); // get cost per km travelled
        System.out.println("Mileage of my car: " + mileage + " km/litre");
        System.out.println("Cost to fill the tank: $" + cost);
        System.out.println("Cost per km travelled: $" + costPerKm);
    }
}

