package poo.vehicle;

public class Motorcycle extends Vehicle {

    private final int wheelSize;

    public Motorcycle(String vehicle, String brand, String model, int year, int wheelSize) {
        super(vehicle, brand, model, year);
        this.wheelSize = wheelSize;
    }

    public int getWheelSize() {
        return wheelSize;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("Wheel size: %d%n%n", getWheelSize());
    }

}
