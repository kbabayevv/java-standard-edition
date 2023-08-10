package abstraction.vehicleinterfaces;

public class Car implements Drivable {
    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Car accelerated to " + speed + " km/h");
    }

    @Override
    public void brake() {
        System.out.println("Car braked");
    }
}
