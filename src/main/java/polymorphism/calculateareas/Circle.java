package polymorphism.calculateareas;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return PI * pow(radius, 2);
    }
}
