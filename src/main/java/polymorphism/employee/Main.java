package polymorphism.employee;

public class Main {
    public static void main(String[] args) {
        Employee manager = new Manager("Orxan", "Rzazade", 1500);
        Employee programmer = new Programmer("Valeh", "Eliyev", 1000);
        System.out.println(manager.calculateSalary());
        System.out.println(programmer.calculateSalary());
    }
}
