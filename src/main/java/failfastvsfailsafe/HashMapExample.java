package failfastvsfailsafe;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> namesAndAges = new HashMap<>();
        namesAndAges.put("Kamran", 24);
        namesAndAges.put("Nurlan", 26);


        Iterator<Map.Entry<String, Integer>> iterator = namesAndAges.entrySet().iterator();
        while (iterator.hasNext()) {
            namesAndAges.put("Orxan", 37);
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
    }
}
