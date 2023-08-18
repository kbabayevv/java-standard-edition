package clone;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person("Kamran");
        Person clonedPerson = (Person) person1.clone();//deep copy
        System.out.println(person1.getName());//Kamran
        System.out.println(clonedPerson.getName());//Kamran
        System.out.println(person1 == clonedPerson);//false because of deep copy
    }
}
