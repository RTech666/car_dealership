package com.pluralsight;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class DealershipFileManager {
    // Set the CSV file.
    private static String INVENTORY_FILE_PATH = "inventory.csv";

    public Dealership getDealership() {
        Dealership dealership = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(INVENTORY_FILE_PATH))) {
            String line;
            // Read the first line to get dealership information.
            String[] dealershipInfo = reader.readLine().split("\\|");

            // Seperate the information from the first line.
            String name = dealershipInfo[0];
            String address = dealershipInfo[1];
            String phone = dealershipInfo[2];

            // Create dealership object.
            dealership = new Dealership(name, address, phone);

            // Read vehicle information
            while ((line = reader.readLine()) != null) {
                String[] vehicleData = line.split("\\|");

                // Seperate the vehicle information.
                int vin = Integer.parseInt(vehicleData[0]);
                int year = Integer.parseInt(vehicleData[1]);
                String make = vehicleData[2];
                String model = vehicleData[3];
                String vehicleType = vehicleData[4];
                String color = vehicleData[5];
                int odometer = Integer.parseInt(vehicleData[6]);
                double price = Double.parseDouble(vehicleData[7]);

                // Create vehicle object and add to dealership inventory.
                Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);
                dealership.addVehicle(vehicle);
            }
        // If any error occurs, print error.
        } catch (IOException e) {
            e.printStackTrace();
        }

        return dealership;
    }

    // Create saveDealerShip method.
    public void saveDealership(Dealership dealership) {
    }
}