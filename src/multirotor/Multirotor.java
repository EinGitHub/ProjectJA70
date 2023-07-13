package multirotor;

import helicopters.Helicopter;

public class Multirotor extends Helicopter {
    private int numberOfRotors;

    public Multirotor() {
        // Default constructor
    }

    public Multirotor(String brand, double price, int horsepower, int numberOfCylinders, int creationYear, int passengerCapacity, int numberOfRotors) {
        super(brand, price, horsepower, numberOfCylinders, creationYear, passengerCapacity);
        this.numberOfRotors = numberOfRotors;
    }

    // Getters and setters
    public int getNumberOfRotors() {
        return numberOfRotors;
    }

    public void setNumberOfRotors(int numberOfRotors) {
        this.numberOfRotors = numberOfRotors;
    }

    // toString and equals methods
    @Override
    public String toString() {
        return "Multirotor: " +
                "Brand: " + getBrand() +
                ", Price: $" + getPrice() +
                ", Horsepower: " + getHorsepower() +
                ", Number of Cylinders: " + getNumberOfCylinders() +
                ", Creation Year: " + getCreationYear() +
                ", Passenger Capacity: " + getPassengerCapacity() +
                ", Number of Rotors: " + numberOfRotors;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Multirotor)) {
            return false;
        }
        Multirotor other = (Multirotor) obj;
        return super.equals(obj) &&
                numberOfRotors == other.getNumberOfRotors();
    }
}
