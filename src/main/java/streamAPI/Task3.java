package streamAPI;

import java.util.List;

public class Task3 {
    //Given a list of integers, calculate and print the sum of all the numbers
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = integerList
                .stream()
                .reduce(0, (total, currentNumber) -> total + currentNumber);

        int sum2 = integerList
                .stream()
                .mapToInt(integer -> integer.intValue()).sum();

        System.out.println(sum);
        System.out.println(sum2);
    }


}
