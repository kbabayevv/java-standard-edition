package generics;

import java.util.ArrayList;
import java.util.List;

public class ReverseOrder {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 3, 4, 5);
        List<String> stringList = List.of("apple", "banana", "cherry", "date");

        List<Integer> reversedIntegers = reverseOrder(integerList);
        List<String> reversedStrings = reverseOrder(stringList);

        System.out.println("Reversed integer list: " + reversedIntegers);
        System.out.println("Reversed string list: " + reversedStrings);
    }


    public static <T> List<T> reverseOrder(List<T> list) {
        List<T> reversedList = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }
}
