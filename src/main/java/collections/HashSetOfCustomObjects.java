package collections;

import java.util.HashSet;
import java.util.Objects;

public class HashSetOfCustomObjects {
    //Define a custom class (e.g., Person) with appropriate equals() and hashCode() methods.
    //Create a HashSet of custom objects and perform operations
    // like adding, removing, and checking for object existence
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Kamran");
        person1.setSurname("Babayev");
        person1.setAge(24);
        Person person2 = new Person();
        person2.setName("Nurlan");
        person2.setSurname("Babayev");
        person2.setAge(26);

        HashSet<Person> persons = new HashSet<>();
        persons.add(person1);
        persons.add(person2);
        System.out.println("Original Hash Set: " + persons);
        persons.remove(person1);
        System.out.println("After removing person1: " + persons);
        boolean test = persons.contains(person1);
        System.out.println("Hash Set contains person1? - > " + test);
        test = persons.contains(person2);
        System.out.println("Hash Set contains person2? - > " + test);

    }
}

class Person {
    private String name;
    private String surname;
    private Integer age;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(age, person.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}