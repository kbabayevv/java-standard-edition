package hashmap;

import java.util.HashMap;

public class Task2 {
    //Write a Java program to count
    // the number of key-value (size) mappings in a map
    public static void main(String[] args) {
        HashMap<Integer, String> personName = new HashMap<>();
        personName.put(0, "Kamran");
        personName.put(1, "Nurlan");
        personName.put(2, "Serxan");
        personName.put(3, "Orxan");
        personName.put(4, "Elmar");
        personName.put(5, "Qamet");
        personName.put(6, "Zaur");

        System.out.println("Size of the hash map: " + personName.size());
    }
}
