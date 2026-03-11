package poo.shapes;

public class Circle extends Shape {

    private final double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double getCircleRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

}
