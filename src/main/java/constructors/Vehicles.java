package constructors;

class Test {
    public static void main(String[] args) {
        Vehicles car = new Car("USA", 2008, 4);
        car.displayDetails();
        Vehicles motorCycle = new Motorcycle("China", 2022, false);
        motorCycle.displayDetails();
    }
}

public class Vehicles {
    private String make;
    private int year;

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }

    public Vehicles(String make, int year) {
        this.make = make;
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("Made in " + make + ", Manufacturing year " + year);
    }
}

class Car extends Vehicles {
    private int numberOfDoors;

    public Car(String make, int year, int numberOfDoors) {
        super(make, year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayDetails() {
        System.out.println("This car made in " + super.getMake() + ", Manufacturing year " + super.getYear() + ", Number of doors " + numberOfDoors);
    }
}

class Motorcycle extends Vehicles {
    private boolean hasSidecar;

    public Motorcycle(String make, int year, boolean hasSidecar) {
        super(make, year);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void displayDetails() {
        System.out.println("This motor Cycle made in " + super.getMake() + ", Manufacturing year " + super.getYear() + ", Does it have Sidecar? " + hasSidecar);
    }
}