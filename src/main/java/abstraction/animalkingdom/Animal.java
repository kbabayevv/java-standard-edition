package abstraction.animalkingdom;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract void makeSound();
}

