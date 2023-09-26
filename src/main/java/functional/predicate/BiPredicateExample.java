package functional.predicate;

import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {
        System.out.println(isEqualTwoWords("Ingress Academy", "Ingress Academy"));
        System.out.println(isEqualWithBiPredicate.test("Ingress Academy", "Ingress Academy"));
    }

    static Boolean isEqualTwoWords(String word1, String word2) {
        return word1.equals(word2);
    }

    static BiPredicate<String, String> isEqualWithBiPredicate =
            String::equals;
}
