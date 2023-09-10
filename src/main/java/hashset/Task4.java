package hashset;

import java.util.HashSet;

public class Task4 {
    // Write a Java program to empty a hash set.
    public static void main(String[] args) {
        HashSet<Integer> counts = new HashSet<>();
        counts.add(0);
        counts.add(1);
        counts.add(2);
        counts.add(3);
        counts.add(4);
        counts.add(5);

        System.out.println("Original variant: " + counts);
        counts.clear();//or we can use this [counts.removeAll(counts);]
        System.out.println("After clearing: " + counts);

    }
}
