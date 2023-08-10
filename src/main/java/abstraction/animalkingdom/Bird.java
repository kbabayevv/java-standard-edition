package abstraction.animalkingdom;

public class Bird extends Animal implements Fly,Swim{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(super.getName()+" sings song");
    }

    @Override
    public void fly() {
        System.out.println(super.getName()+" is flying");
    }

    @Override
    public void swim() {
        System.out.println(super.getName()+" is swimming");
    }
}
