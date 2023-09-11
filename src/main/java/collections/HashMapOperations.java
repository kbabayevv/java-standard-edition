package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapOperations {
    //Create a HashMap where keys are strings (names) and values are integers (ages).
    //Add, remove, and update key-value pairs.
    //Retrieve the value associated with a specific key.
    //Iterate through the keys and values in the HashMap.
    public static void main(String[] args) {
        HashMap<String, Integer> namesAndAges = new HashMap<>();
        namesAndAges.put("Kamran", 24);
        namesAndAges.put("Qamet", 25);
        namesAndAges.put("Nurlan", 26);
        namesAndAges.put("Orxan", 37);

        System.out.println("Original Hash Map: " + namesAndAges);
        System.out.println("Get value of Kamran = " + namesAndAges.get("Kamran"));
        namesAndAges.remove("Orxan");
        System.out.println("After removing Orxan: " + namesAndAges);

        String nameToUpdate = "Nurlan";
        Integer newAge = 27;//updating
        namesAndAges.put(nameToUpdate, newAge);

        System.out.println("Iterate keys and values");
        Iterator<Entry<String, Integer>> iterator = namesAndAges.entrySet().iterator();
        while (iterator.hasNext()) {
            Entry<String, Integer> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
    }
}
