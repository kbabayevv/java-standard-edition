package functional.function;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        System.out.println(getIncrementByOne(5));
        System.out.println(incrementByOneWithFunction.andThen(multiplyBy5WithFunction).apply(4));
        System.out.println(showNumber.apply(5));

    }

    static int getIncrementByOne(int number) {
        return number + 1;
    }

    static Function<Integer, Integer> incrementByOneWithFunction =
            number -> ++number;

    static Function<Integer, Integer> multiplyBy5WithFunction =
            number -> number * 5;

    static Function<Integer, String> showNumber =
            number -> "Number is : " + number;
}
