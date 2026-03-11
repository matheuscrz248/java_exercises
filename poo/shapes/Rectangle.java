package poo.shapes;

public class Rectangle extends Shape {

    private final double width, height;

    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    public double getRectangleWidth() {
        return width;
    }

    public double getRectangleHeight() {
        return height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }


}