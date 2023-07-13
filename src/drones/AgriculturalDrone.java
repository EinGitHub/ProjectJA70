package drones;

import uav.UAV;

public class AgriculturalDrone extends UAV {
    private String brand;
    private int carryCapacity;

    public AgriculturalDrone() {
        // Default constructor
    }

    public AgriculturalDrone(double weight, double price, String brand, int carryCapacity) {
        super(weight, price);
        this.brand = brand;
        this.carryCapacity = carryCapacity;
    }

    // Getters and setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCarryCapacity() {
        return carryCapacity;
    }

    public void setCarryCapacity(int carryCapacity) {
        this.carryCapacity = carryCapacity;
    }

    // toString and equals methods
    @Override
    public String toString() {
        return "Agricultural Drone: " +
                "Weight: " + getWeight() +
                ", Price: $" + getPrice() +
                ", Brand: " + brand +
                ", Carry Capacity: " + carryCapacity + " kg";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AgriculturalDrone)) {
            return false;
        }
        AgriculturalDrone other = (AgriculturalDrone) obj;
        return super.equals(obj) &&
                brand.equals(other.getBrand()) &&
                carryCapacity == other.getCarryCapacity();
    }
}
