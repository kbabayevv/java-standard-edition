package polymorphism.vehicle;

public class Car extends Vehicle {
    public Car(String name, int maxSpeed) {
        super(name, maxSpeed);
    }
     @Override
    public void speedUp() {
        System.out.println(this.getName() + " speed up " + this.getMaxSpeed() + " km/h");
    }
}