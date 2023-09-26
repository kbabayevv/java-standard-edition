package functional.function;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        System.out.println(incrementAndMultiplyByNumber(3, 5));
        System.out.println(incrementAndMultiplyByNumberWithBiFunction.apply(3, 5));
        System.out.println(concatTwoStrings.apply("Kamran ", "Babayev"));
    }

    static int incrementAndMultiplyByNumber(int number, int multipleBy) {
        return ++number * multipleBy;
    }

    static BiFunction<Integer, Integer, Integer> incrementAndMultiplyByNumberWithBiFunction =
            (number, multipleBy) -> ++number * multipleBy;

    static BiFunction<String, String, String> concatTwoStrings =
            (word1, word2) -> word1.concat(word2);
}
