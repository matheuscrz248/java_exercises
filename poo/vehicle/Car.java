package poo.vehicle;

public class Car extends Vehicle {

    private final int doors;

    public Car(String vehicle, String brand, String model, int year, int doors) {
        super(vehicle, brand, model, year);
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("Doors: %d%n%n", getDoors());
    }

}
