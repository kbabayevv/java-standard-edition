package creational.factory;

public class PhoneSeller {
    public static void main(String[] args) {
        Phone s8 = PhoneFactory.getPhone("s8", "2450mah", 4, 5);

        Phone note8 = PhoneFactory.getPhone("note8", "3000mah", 5, 7);

        System.out.println("s8 specifications: ");
        System.out.println(s8);
        System.out.println();
        System.out.println("note8 specifications: ");
        System.out.println(note8);
    }
}
