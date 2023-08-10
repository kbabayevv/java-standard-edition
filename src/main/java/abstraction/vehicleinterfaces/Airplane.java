package abstraction.vehicleinterfaces;

public class Airplane implements Drivable, Flyable {
    @Override
    public void start() {
        System.out.println("Airplane started");
    }

    @Override
    public void stop() {
        System.out.println("Airplane stopped");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Airplane accelerated to " + speed + " km/h");
    }

    @Override
    public void brake() {
        System.out.println("Airplane braked");
    }

    @Override
    public void takeOff() {
        System.out.println("Airplane took off");
    }

    @Override
    public void fly() {
        System.out.println("Airplane flied");
    }

    @Override
    public void land() {
        System.out.println("Airplane landed");
    }
}
