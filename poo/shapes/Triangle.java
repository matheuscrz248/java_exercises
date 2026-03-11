package poo.shapes;

public class Triangle extends Shape {

    private final double base, height;

    public Triangle(String name, double base, double height) {
        super(name);
        this.base = base;
        this.height = height;
    }

    public double getTriangleBase() {
        return base;
    }

    public double getTriangleHeight() {
        return height;
    }

    @Override
    public double calculateArea() {
        return (base * height) / 2;
    }


}
