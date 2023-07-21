package controlflow;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));


    }

    public static boolean isPalindrome(int number) {
        int count = number;
        int palindrome = 0;
        while (count > 0) {
            int remain = count % 10;//1
            palindrome = palindrome * 10 + remain;//121
            count /= 10;//1
        }
        return palindrome == number;
    }
}
