package controlflow;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int a, int b) {
        if (a >= 10 && a <= 99 && b >= 10 && b <= 99) {
            int a1 = a / 10;
            int a2 = a % 10;
            int b1 = b / 10;
            int b2 = b % 10;
            if (a1 == b1 || a1 == b2 || a2 == b1 || a2 == b2) {
                return true;
            } else return false;
        }
        return false;
    }
}
