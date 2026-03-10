package poo.vehicle;

public class Vehicle {
    private final String vehicle, brand, model;
    private final int year;

    public Vehicle(String vehicle, String brand, String model, int year) {
        this.vehicle = vehicle;
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getVehicle() {
        return vehicle;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void printInfo() {
        System.out.printf("Vehicle: %s%nBrand: %s%nModel: %s%nYear: %d%n", getVehicle(), getBrand(), getModel(), getYear());
    }


}
