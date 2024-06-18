import BT1.Bicycle;
import BT1.Car;
import BT1.Vehicle;
import BT2.Employee;
import BT2.HRManager;
import BT3.Developer;
import BT3.Manager;
import BT3.Programmer;
import BT4.Motorbike;
import BT4.Trunk;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // BT1
        System.out.print("\nExercise 1: \n");
        Vehicle vehicle = new Vehicle();
        Vehicle myCar = new Car();
        Vehicle myBicycle = new Bicycle();

        vehicle.speedUp();
        myCar.speedUp();
        myBicycle.speedUp();

        // BT2
        System.out.print("\nExercise 2: \n");
        Employee employee = new Employee();
        HRManager hrManager = new HRManager();

        employee.work();
        employee.getSalary();

        hrManager.work();
        hrManager.getSalary();
        hrManager.addEmployee();

        // BT3
        System.out.print("\nExercise 3: \n");
        Manager manager = new Manager();
        Developer developer = new Developer();
        Programmer programmer = new Programmer();

        System.out.println("Enter data for a manager:");
        manager.readData();
        System.out.println("\nEnter data for a developer:");
        developer.readData();
        System.out.println("\nEnter data for a programmer:");
        programmer.readData();

        System.out.println("\nInfo of manager: ");
        manager.displayInfo();
        System.out.println("\nInfo of developer: ");
        developer.displayInfo();
        System.out.println("\nInfo of programmer: ");
        programmer.displayInfo();

        System.out.println("\nResult: \n");

        manager.calculateBonus();
        developer.calculateBonus();
        programmer.calculateBonus();

        manager.reportPerformance("Excellent");
        developer.reportPerformance("Good");
        programmer.reportPerformance("Excellent");

        manager.manageProject();
        developer.writeCode();
        programmer.debugCode();

        // BT4
        System.out.print("\nExercise 4: \n");
        BT4.Vehicle vehicle4 = new BT4.Vehicle();
        Trunk trunk = new Trunk();
        BT4.Car car4 = new BT4.Car();
        Motorbike motorbike = new Motorbike();

        System.out.println("Enter data for a trunk:");
        trunk.readData();
        System.out.println("\nEnter data for a car:");
        car4.readData();
        System.out.println("\nEnter data for a motorbike:");
        motorbike.readData();

        System.out.println("\nResult: ");

        System.out.println("\nInfo of trunk: ");
        trunk.getModel();
        trunk.displayInfo();
        System.out.println("\nInfo of car: ");
        car4.getModel();
        car4.displayInfo();
        System.out.println("\nInfo of motorbike: ");
        motorbike.getModel();
        motorbike.displayInfo();
    }
}