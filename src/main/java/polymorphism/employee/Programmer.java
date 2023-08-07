package polymorphism.employee;

public class Programmer extends Employee {
    public Programmer(String name, String surname, double salary) {
        super(name, surname, salary);
    }

    @Override
    public double calculateSalary() {
        return super.getSalary();
    }


}
