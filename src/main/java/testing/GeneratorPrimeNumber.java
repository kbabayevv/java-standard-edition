package testing;

import java.util.Random;

public class GeneratorPrimeNumber {
    // Function to check if a number is prime
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Function to generate the next prime number greater than or equal to a given number
    static int getNextPrime(int start) {
        int num = start;
        while (true) {
            if (isPrime(num)) {
                return num;
            }
            num++;
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int randomStart = random.nextInt(100); // Change the upper limit as needed

        int nextPrime = getNextPrime(randomStart);
        System.out.println("Random prime number: " + nextPrime);
    }
}
