package BT3;

import java.util.Scanner;

public class Employee {
    protected String name;
    protected String address;
    protected double salary;
    protected String position;



    public Employee() {

    }

    public void readData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        this.name = scanner.nextLine();
        System.out.print("Enter address: ");
        this.address = scanner.nextLine();
        System.out.print("Enter salary: ");
        this.salary = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter position: ");
        this.position = scanner.nextLine();
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
        System.out.println("Position: " + position);
    }

    public void reportPerformance(String performance) {
        System.out.println("Performance report for " + position + " " + name + ": " + performance);
    }

    public void calculateBonus() {
        double bonus = salary * 0.10;
        System.out.println(position + "'s Bonus: $" + bonus);
    }
}
