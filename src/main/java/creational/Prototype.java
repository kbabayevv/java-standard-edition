package creational;

public class Prototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person("Kamran");
        Person clonedPerson = (Person) person1.clone();//deep copy
        System.out.println(person1.getName());//Kamran
        System.out.println(clonedPerson.getName());//Kamran
        System.out.println(person1 == clonedPerson);//false because of deep copy
    }
}

class Person implements Cloneable {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
