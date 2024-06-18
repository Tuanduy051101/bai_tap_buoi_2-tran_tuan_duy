package BT4;

import java.util.Scanner;

public class Vehicle {
    public String model;
    public String designs;
    public String fuelType;
    public int year;
    protected double fuelEfficiency; // miles per gallon
    protected double distanceTraveled;
    protected double maxSpeed;

    public Vehicle() {
    }

    public void readData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter model: ");
        this.model = scanner.nextLine();
        System.out.print("Enter designs: ");
        this.designs = scanner.nextLine();
        System.out.print("Enter fuelType: ");
        this.fuelType = scanner.nextLine();
        System.out.print("Enter year: ");
        this.year = scanner.nextInt();
        System.out.print("Enter fuel efficiency (mpg): ");
        this.fuelEfficiency = scanner.nextDouble();
        System.out.print("Enter max speed (mph): ");
        this.maxSpeed = scanner.nextDouble();
        scanner.nextLine(); // Consume the remaining newline
    }

    public void displayInfo() {
        //System.out.println("Model: " + this.model);
        System.out.println("Designs: " + this.designs);
        System.out.println("Fuel type: " + this.fuelType);
        System.out.println("Year: " + this.year);
        System.out.println("Fuel Efficiency: " + this.fuelEfficiency + " mpg");
        System.out.println("Distance Traveled: " + this.distanceTraveled + " miles");
        System.out.println("Max Speed: " + this.maxSpeed + " mph");
        System.out.println("Fuel Used: " + calculateFuelUsed() + " gallons");
    }

    public void getModel() {
        System.out.println("This is the vehicle model!");
    }

    public void travel(double miles) {
        this.distanceTraveled += miles;
    }

    public double calculateFuelUsed() {
        return distanceTraveled / fuelEfficiency;
    }
}