package stringbuilder;

import creditcardnumberalgorithm.LuhnAlgorithm;

public class HidingCardNumber {
    public static void main(String[] args) {
        String creditCardNumber = "5678 1234 5670 1234";
        //for checking creditCardNumber is valid or not
        boolean valid = LuhnAlgorithm.isValid(creditCardNumber);
        if (valid) {
            String result = hidingMiddleNumbers(creditCardNumber);
            System.out.println("Card Number " + result);
        } else {
            System.out.println("The credit card number is not valid.");
        }
    }

    public static String hidingMiddleNumbers(String number) {
        StringBuilder hiddenCardNumber = new StringBuilder(number);
        hiddenCardNumber.replace(5, 14, "**** ****");
        return hiddenCardNumber.toString();
    }
}
