package abstraction.vehicleinterfaces;

public class Main {
    public static void main(String[] args) {
        Airplane airplane = new Airplane();
        airplane.start();
        airplane.accelerate(50);
        airplane.takeOff();
        airplane.fly();
        airplane.land();
        airplane.brake();
        airplane.stop();
        Car car = new Car();
        car.start();
        car.accelerate(100);
        car.brake();
        car.stop();
    }
}
