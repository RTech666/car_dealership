package com.pluralsight;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    // Initalize the scanner.
    static Scanner scanner = new Scanner(System.in);

    // Create the variables.
    public Dealership dealership;
    public int choice;
    public DealershipFileManager dealershipFileManager;
    public List<Vehicle> vehicles;

    // Create userInterface method.
    public UserInterface() {
        // Call the display method.
        display();
    }

    public void display() {
        init();
        while (true) {
            // Print menu options.
            System.out.println("\n--- Menu ---");
            System.out.println("1. Search by price");
            System.out.println("2. Search by make and model");
            System.out.println("3. Search by year");
            System.out.println("4. Search by color");
            System.out.println("5. Search by mileage");
            System.out.println("6. Search by vehicle type");
            System.out.println("7. List all vehicles");
            System.out.println("8. Add a vehicle");
            System.out.println("9. Remove a vehicle");
            System.out.println("0. Exit");

            // Ask the user to enter their choice.
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            // Read the user input and execute the appropiate method.
            switch (choice) {
                case 1:
                    processGetByPriceRequest();
                    break;
                case 2:
                    processGetByMakeModelRequest();
                    break;
                case 3:
                    processGetByYearRequest();
                    break;
                case 4:
                    processGetByColorRequest();
                    break;
                case 5:
                    processGetByMilageRequest();
                    break;
                case 6:
                    processGetByVehicleTypeRequest();
                    break;
                case 7:
                    processGetAllVehiclesRequest();
                    break;
                case 8:
                    processAddVehicleRequest();
                    break;
                case 9:
                    processRemoveVehicleRequest();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid Input. Please try again.");
            }
        }
    }

    // Create the private init method.
    private void init() {
        // Initalize the variable.
        dealershipFileManager = new DealershipFileManager();
        this.dealership = dealershipFileManager.getDealership();
    }

    // Create the private displayVehicles method.
    private void displayVehicles(List<Vehicle> vehicles) {
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles found.");
            return;
        }
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }

    // Create the processGetAllVehiclesRequest method.
    public void processGetAllVehiclesRequest() {
        // Initalize the variable.
        vehicles = dealership.getAllVehicles();
        displayVehicles(vehicles);
    }

    // Create the processGetByPriceRequest method.
    public void processGetByPriceRequest() {

    }

    // Create the processGetByMakeModelRequest method.
    public void processGetByMakeModelRequest() {

    }

    // Create the processGetByYearRequest method.
    public void processGetByYearRequest() {

    }

    // Create the processGetByColorRequest method.
    public void processGetByColorRequest() {

    }

    // Create the processGetByMilageRequest method.
    public void processGetByMilageRequest() {

    }

    // Create the processGetByVehicleTypeRequest method.
    public void processGetByVehicleTypeRequest() {

    }

    // Create the processAddVehicleRequest method.
    public void processAddVehicleRequest() {

    }

    // Create the processRemoveVehicleRequest method.
    public void processRemoveVehicleRequest() {

    }
}