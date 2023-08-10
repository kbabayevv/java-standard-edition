package abstraction.animalkingdom;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Tom");
        cat.makeSound();
        Dog dog = new Dog("Rex");
        dog.makeSound();
        dog.swim();
        Bird bird = new Bird("Dove");
        bird.makeSound();
        bird.swim();
    }
}
