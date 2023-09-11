package collections;

import java.util.HashSet;

public class HashSetOperations {
    //Create a HashSet of integers and add elements to it.
    //Check if a specific element exists in the HashSet.
    //Remove an element from the HashSet.
    //Print all the elements in the HashSet.
    public static void main(String[] args) {
        HashSet<Integer> counts = new HashSet<>();
        counts.add(0);
        counts.add(1);
        counts.add(2);
        counts.add(3);
        counts.add(4);
        System.out.println("Original Hash Set: " + counts);

        if (counts.contains(4)) {
            System.out.println("Yes it contains 4");
        } else {
            System.out.println("No such element");
        }

        counts.remove(0);
        System.out.println("After removing 0: " + counts);
    }
}
