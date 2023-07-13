package airplanes;

public class Airplane {
    private String brand;
    private double price;
    private int horsepower;

    public Airplane() {
        // Default constructor
    }

    public Airplane(String brand, double price, int horsepower) {
        this.brand = brand;
        this.price = price;
        this.horsepower = horsepower;
    }

    // Getters and setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    // toString and equals methods
    @Override
    public String toString() {
        return "Airplane: " +
                "Brand: " + brand +
                ", Price: $" + price +
                ", Horsepower: " + horsepower;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Airplane)) {
            return false;
        }
        Airplane other = (Airplane) obj;
        return brand.equals(other.getBrand()) &&
                price == other.getPrice() &&
                horsepower == other.getHorsepower();
    }
}
