package hashset;

import java.util.HashSet;

public class Task1 {
    //Write a Java program to append
    // the specified element to the end of a hash set.
    public static void main(String[] args) {
        HashSet<String> animal = new HashSet<>();
        animal.add("Cat");
        animal.add("Dog");
        animal.add("Monkey");
        animal.add("Horse");

        System.out.println("Animals: " + animal);
    }
}
