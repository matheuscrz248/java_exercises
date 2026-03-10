package poo.vehicle;

public class Main {
    public static void main(String[] args) {

    Car car1 = new Car("Car", "Toyota", "Corolla", 2022, 4);
    Car car2 = new Car("Car", "Honda", "Civic", 2020, 4);

    Motorcycle motorcycle1 = new Motorcycle("Motorcycle", "Yamaha", "MT-07", 2022, 17);
    Motorcycle motorcycle2 = new Motorcycle("Motorcycle", "Harley Davidson", "Sportster", 2021, 19);

    car1.printInfo();
    car2.printInfo();

    if (car1.getYear() > car2.getYear()) {
        System.out.printf("%s %d is newer than the %s %d!%n%n", car1.getModel(), car1.getYear(), car2.getModel(), car2.getYear());
    }
    else if (car2.getYear() > car1.getYear()) {
        System.out.printf("%s %d is newer than the %s %d!%n%n", car2.getModel(), car2.getYear(), car1.getModel(), car1.getYear());
    }
    else {
        System.out.printf("The %s %d and %s %d are from the same year!%n%n", car1.getModel(), car1.getYear(), car2.getModel(), car2.getYear());
    }

    motorcycle1.printInfo();
    motorcycle2.printInfo();

    if (motorcycle1.getWheelSize() > motorcycle2.getWheelSize()) {
        System.out.printf("The wheel size of the %s (%d) is larger than the %s (%d)!%n%n", motorcycle1.getModel(), motorcycle1.getWheelSize(), motorcycle2.getModel(), motorcycle2.getWheelSize());
    }
    else if (motorcycle2.getWheelSize() > motorcycle1.getWheelSize()) {
        System.out.printf("The wheel size of the %s (%d) is larger than the %s (%d)!%n%n", motorcycle2.getModel(), motorcycle2.getWheelSize(), motorcycle1.getModel(), motorcycle1.getWheelSize());
    }
    else {
        System.out.printf("The %s (%d) wheel size is the same as the %s (%d)!%n%n", motorcycle1.getModel(), motorcycle1.getWheelSize(), motorcycle2.getModel(), motorcycle2.getWheelSize());
    }


    }
}
