package poo.shapes;

public class Shape {

    private final String name;

    public String getName() {
        return name;
    }

    public Shape(String name) {
        this.name = name;
    }

    public double calculateArea() {
        return 0;
    }

    public void printInfo() {
        System.out.printf("Shape: %s%nArea: %.2f%n%n", getName(), calculateArea());
    }

}
