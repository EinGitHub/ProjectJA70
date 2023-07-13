package uav;

import multirotor.Multirotor;

public class UAV extends Multirotor {
    private double weight;
    private double price;

    public UAV() {
        // Default constructor
    }

    public UAV(double weight, double price) {
        this.weight = weight;
        this.price = price;
    }

    // Getters and setters
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // toString and equals methods
    @Override
    public String toString() {
        return "UAV: " +
                "Weight: " + weight +
                ", Price: $" + price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UAV)) {
            return false;
        }
        UAV other = (UAV) obj;
        return weight == other.getWeight() &&
                price == other.getPrice();
    }
}
