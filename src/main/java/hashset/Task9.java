package hashset;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Task9 {
    //Write a Java program to find numbers less than 7 in a tree set
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(0);
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);
        hashSet.add(6);
        hashSet.add(7);
        hashSet.add(8);
        System.out.println("Original Hash Set: " + hashSet);

        Set<Integer> tree_set = new TreeSet<>(hashSet);
        tree_set.removeIf(e -> e < 7);
        System.out.println("Tree set after remove element which <7: " + tree_set);

    }
}
