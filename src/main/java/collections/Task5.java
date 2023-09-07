package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task5 {
    //Write a method that takes an ArrayList of Integers and returns a reversed version of the ArrayList.
    //For example, if we had an ArrayList<Integer> list with the values [1, 2, 3]
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        System.out.println("Original list: " + list);
        System.out.println("Reversed list: " + reverseOrder(list));
    }

    public static List<Integer> reverseOrder(List<Integer> list) {
        Collections.reverse(list);
        return list;
    }
}
