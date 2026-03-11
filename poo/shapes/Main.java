package poo.shapes;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle("Circle", 5);
        Rectangle retangle = new Rectangle("Rectangle", 10.5, 7);
        Triangle triangle = new Triangle("Triangle", 5.4, 3);

        circle.printInfo();
        retangle.printInfo();
        triangle.printInfo();

    }
}
