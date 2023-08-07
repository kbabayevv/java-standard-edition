package polymorphism.vehicle;

public class Vehicle {
    private String name;
    private int maxSpeed;

    public Vehicle(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void speedUp() {
        System.out.println(this.name + " speed up " + this.maxSpeed + " km/h");
    }


}