package streamAPI;

import java.util.List;

public class Task1 {
    //Given a list of integers, filter out the even numbers and print them.
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        integerList
                .stream()
                .filter(integer -> integer % 2 == 0)
                .forEach(number -> System.out.println(number));

    }
}
