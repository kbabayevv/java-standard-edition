package abstraction.animalkingdom;

public class Dog extends Animal implements Swim {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(super.getName() + " barks");
    }

    @Override
    public void swim() {
        System.out.println(super.getName() + " is swimming");
    }
}
