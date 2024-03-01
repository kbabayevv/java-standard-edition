package creditcardnumberalgorithm;

public class LuhnAlgorithm {

    public static void main(String[] args) {
        String creditCardNumber = "5678 1234 5670 1234"; // Replace this with your credit card number
        boolean isValid = isValid(creditCardNumber);

        if (isValid) {
            System.out.println("The credit card number is valid.");
        } else {
            System.out.println("The credit card number is not valid.");
        }
    }

    public static boolean isValid(String number) {
        number = number.replaceAll("[^0-9]", "");
        int sum = 0;
        boolean alternate = true;

        for (int i = 0; i < number.length(); i++) {
            int digit = Character.getNumericValue(number.charAt(i));

            if (alternate) {
                digit *= 2;
                if (digit > 9) {
                    digit = digit / 10 + digit % 10;
                }
            }

            sum += digit;
            alternate = !alternate;
        }
        System.out.println("Sum is : " + sum);
        return (sum % 10 == 0);
    }
}
