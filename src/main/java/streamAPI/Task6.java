package streamAPI;

import java.util.List;

public class Task6 {
    //Given a list of strings, sort them in lexicographical (dictionary)
    // order and limit the result to the first three strings. Print the sorted and limited list
    public static void main(String[] args) {
        List<String> list = List.of("Z", "C", "A", "K", "D", "R");
        list
                .stream()
                .sorted()
                .limit(3)
                .forEach(letter -> System.out.println(letter));

    }
}
