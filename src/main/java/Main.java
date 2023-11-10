import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws Exception {
          B b = new B("Kamran","Nurlan");
          B b1 = new B(1,2.0);
    }


}

class A {
    public A() {
        System.out.println("I am super");
    }
}

class B extends A {

    private String name;
    private String surname;
    private Integer age;
    private Double salary;

    public B(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public B(Integer age, Double salary) {
        this.age = age;
        this.salary = salary;
    }
}


