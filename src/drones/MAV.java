package drones;

import uav.UAV;

public class MAV extends UAV {
    private String model;
    private double size;

    public MAV() {
        // Default constructor
    }

    public MAV(double weight, double price, String model, double size) {
        super(weight, price);
        this.model = model;
        this.size = size;
    }

    // Getters and setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    // toString and equals methods
    @Override
    public String toString() {
        return "MAV: " +
                "Weight: " + getWeight() +
                ", Price: $" + getPrice() +
                ", Model: " + model +
                ", Size: " + size;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MAV)) {
            return false;
        }
        MAV other = (MAV) obj;
        return super.equals(obj) &&
                model.equals(other.getModel()) &&
                size == other.getSize();
    }
}
