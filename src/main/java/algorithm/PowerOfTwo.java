package algorithm;

public class PowerOfTwo {
    public static void main(String[] args) {
        int number = 127;
        int result = findPowerOfTwo(number);
        System.out.println("Power of 2 for " + number + " is: " + result);
    }

    public static int findPowerOfTwo(int n) {
        if (n == 1)
            return 0;
        else
            return 1 + findPowerOfTwo(n / 2);
    }
}
