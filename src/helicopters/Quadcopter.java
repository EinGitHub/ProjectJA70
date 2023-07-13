package helicopters;

public class Quadcopter extends Helicopter {
    private int maxFlyingSpeed;

    public Quadcopter() {
        // Default constructor
    }

    public Quadcopter(String brand, double price, int horsepower, int numberOfCylinders, int creationYear, int passengerCapacity, int maxFlyingSpeed) {
        super(brand, price, horsepower, numberOfCylinders, creationYear, passengerCapacity);
        this.maxFlyingSpeed = maxFlyingSpeed;
    }

    // Getters and setters
    public int getMaxFlyingSpeed() {
        return maxFlyingSpeed;
    }

    public void setMaxFlyingSpeed(int maxFlyingSpeed) {
        this.maxFlyingSpeed = maxFlyingSpeed;
    }

    // toString and equals methods
    @Override
    public String toString() {
        return "Quadcopter: " +
                "Brand: " + getBrand() +
                ", Price: $" + getPrice() +
                ", Horsepower: " + getHorsepower() +
                ", Number of Cylinders: " + getNumberOfCylinders() +
                ", Creation Year: " + getCreationYear() +
                ", Passenger Capacity: " + getPassengerCapacity() +
                ", Max Flying Speed: " + maxFlyingSpeed;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Quadcopter)) {
            return false;
        }
        Quadcopter other = (Quadcopter) obj;
        return super.equals(obj) &&
                maxFlyingSpeed == other.getMaxFlyingSpeed();
    }
}
