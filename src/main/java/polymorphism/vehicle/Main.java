package polymorphism.vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle bicycle = new Bicycle("Bravery", 30);
        Vehicle car = new Car("Mersedes-Benz", 240);
        bicycle.speedUp();
        car.speedUp();
    }
}
