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
        int sum = 0;
        boolean alternate = false;

        for (int i = number.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(number.charAt(i));

            if (alternate) {
                digit *= 2;
                if (digit > 9) {
                    digit -= 9;
                }
            }

            sum += digit;
            alternate = !alternate;
        }

        return (sum % 10 == 0);
    }
}
