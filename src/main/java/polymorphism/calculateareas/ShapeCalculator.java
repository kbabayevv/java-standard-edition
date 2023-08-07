package polymorphism.calculateareas;

public class ShapeCalculator {
    public static void main(String[] args) {
        System.out.println(calculateArea(new Circle(2.5)));
        System.out.println(calculateArea(new Rectangle(2.5, 3)));
        System.out.println(calculateArea(new Triangle(17, 16, 19)));
    }

    public static double calculateArea(Shape shape) {
        return shape.calculateArea();
    }
}
