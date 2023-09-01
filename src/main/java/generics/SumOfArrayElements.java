package generics;

import java.util.List;

public class SumOfArrayElements {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Sum of even numbers: " + sumEven(numbers));
        System.out.println("Sum of odd numbers: " + sumOdd(numbers));

    }

    public static <T extends Number> int sumEven(List<T> array) {
        int sum = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).intValue() % 2.0 == 0.0) {
                sum += array.get(i).intValue();
            }
        }
        return sum;
    }

    public static <T extends Number> int sumOdd(List<T> array) {
        int sum = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).intValue() % 2 != 0) {
                sum += array.get(i).intValue();
            }
        }
        return sum;
    }
}
