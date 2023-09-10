package hashset;

import java.util.Arrays;
import java.util.HashSet;

public class Task7 {
    // Write a Java program to convert a hash set to an array
    public static void main(String[] args) {
        HashSet<Integer> counts = new HashSet<>();
        counts.add(0);
        counts.add(1);
        counts.add(2);
        counts.add(3);
        counts.add(4);

        System.out.println("Original Hash Set: " + counts);
        Integer[] arr = counts.toArray(new Integer[counts.size()]);
        System.out.println("Array from Hash Set: " + Arrays.toString(arr));
    }
}
