package hashset;

import java.util.HashSet;

public class Task5 {
    //Write a Java program to
    // test if a hash set is empty or not
    public static void main(String[] args) {
        HashSet<String> persons = new HashSet<>();
        persons.add("Kamran Babayev");
        persons.add("Nurlan Babayev");
        persons.add("Orxan Rehimov");
        persons.add("Terlan Mirzeyev");

        boolean test = persons.isEmpty();
        System.out.println("Original Hash Set: " + persons + " \nSet is empty? " + test);
        persons.removeAll(persons);
        test = persons.isEmpty();
        System.out.println("Removing All Elements from Hash Set: " + persons + " \nSet is empty? " + test);


    }
}
