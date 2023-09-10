package hashset;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Task8 {
    //Write a Java program to convert a hash set to a tree set.
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Black");
        colors.add("White");
        colors.add("Pink");
        colors.add("Yellow");
        System.out.println("Original Hash Set: " + colors);

        Set<String> tree_set = new TreeSet<>(colors);
        System.out.println("TreeSet elements: ");
        for (String element : tree_set) {
            System.out.println(element);
        }
    }
}
