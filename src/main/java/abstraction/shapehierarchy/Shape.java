package abstraction.shapehierarchy;

public abstract class Shape {
    private String name;

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    public Shape(String name) {
        this.name = name;
    }
}
