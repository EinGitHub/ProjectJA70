package helicopters;

import airplanes.Airplane;

public class Helicopter extends Airplane {
    private int numberOfCylinders;
    private int creationYear;
    private int passengerCapacity;

    public Helicopter() {
        // Default constructor
    }

    public Helicopter(String brand, double price, int horsepower, int numberOfCylinders, int creationYear, int passengerCapacity) {
        super(brand, price, horsepower);
        this.numberOfCylinders = numberOfCylinders;
        this.creationYear = creationYear;
        this.passengerCapacity = passengerCapacity;
    }

    // Getters and setters
    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    public int getCreationYear() {
        return creationYear;
    }

    public void setCreationYear(int creationYear) {
        this.creationYear = creationYear;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    // toString and equals methods
    @Override
    public String toString() {
        return "Helicopter: " +
                "Brand: " + getBrand() +
                ", Price: $" + getPrice() +
                ", Horsepower: " + getHorsepower() +
                ", Number of Cylinders: " + numberOfCylinders +
                ", Creation Year: " + creationYear +
                ", Passenger Capacity: " + passengerCapacity;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Helicopter)) {
            return false;
        }
        Helicopter other = (Helicopter) obj;
        return super.equals(obj) &&
                numberOfCylinders == other.getNumberOfCylinders() &&
                creationYear == other.getCreationYear() &&
                passengerCapacity == other.getPassengerCapacity();
    }
}
