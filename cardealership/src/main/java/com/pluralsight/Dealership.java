package com.pluralsight;
import java.util.ArrayList;
import java.util.List;

class Dealership {
    // Create the variables, as private.
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;
    private List<Vehicle> result;

    // Create the constructor.
    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();
    }

    // Create the getters and setters.
    public List<Vehicle> getVehiclesByPrice(double min, double max) {
        // Initalize the array.
        result = new ArrayList<>();

        // Check for vehicle by price.
        for (Vehicle vehicle : inventory) {
            if (vehicle.getPrice() >= min && vehicle.getPrice() <= max) {
                result.add(vehicle);
            }
        }

        return result;
    }

    public List<Vehicle> getVehiclesByMakeModel(String make, String model) {
        // Initalize the array.
        result = new ArrayList<>();

        // Check for vehicle by make and model.
        for (Vehicle vehicle : inventory) {
            if (vehicle.getMake().equals(make) && vehicle.getModel().equals(model)) {
                result.add(vehicle);
            }
        }

        return result;
    }

    public List<Vehicle> getVehiclesByYear(int min, int max) {
        // Initalize the array.
        result = new ArrayList<>();

        // Check for vehicle by year.
        for (Vehicle vehicle : inventory) {
            if (vehicle.getYear() >= min && vehicle.getYear() <= max) {
                result.add(vehicle);
            }
        }

        return result;
    }

    public List<Vehicle> getVehiclesByColor(String color) {
        // Initalize the array.
        result = new ArrayList<>();

        // Check for vehicle by color.
        for (Vehicle vehicle : inventory) {
            if (vehicle.getColor().equals(color)) {
                result.add(vehicle);
            }
        }

        return result;
    }

    public List<Vehicle> getVehiclesByMilage(int min, int max) {
        // Initalize the array.
        result = new ArrayList<>();

        // Check for vehicle by milage.
        for (Vehicle vehicle : inventory) {
            if (vehicle.getOdometer() >= min && vehicle.getOdometer() <= max) {
                result.add(vehicle);
            }
        }

        return result;
    }

    public List<Vehicle> getVehiclesByType(String vehicleType) {
        // Initalize the array.
        result = new ArrayList<>();

        // Check for vehicle by type.
        for (Vehicle vehicle : inventory) {
            if (vehicle.getVehicleType().equals(vehicleType)) {
                result.add(vehicle);
            }
        }

        return result;
    }

    public List<Vehicle> getAllVehicles() {
        return new ArrayList<>(inventory);
    }

    public void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        inventory.remove(vehicle);
    }
}
