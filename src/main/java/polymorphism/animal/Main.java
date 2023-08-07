package polymorphism.animal;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();
        Animal bird = new Bird();
        bird.sound();
        Animal cat = new Cat();
        cat.sound();
    }
}
