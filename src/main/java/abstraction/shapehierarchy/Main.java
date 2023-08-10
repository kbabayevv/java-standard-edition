package abstraction.shapehierarchy;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle("Circle", 2);
        System.out.println("Area of circle = " + circle.calculateArea());
        System.out.println("Perimeter of circle = " + circle.calculatePerimeter());
        Shape rectangle = new Rectangle("Rectangle", 5, 4);
        System.out.println("Area of rectangle = " + rectangle.calculateArea());
        System.out.println("Perimeter of rectangle = " + rectangle.calculatePerimeter());
    }
}
