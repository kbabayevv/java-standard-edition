package abstraction.shapehierarchy;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return width * length;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + length);
    }
}
