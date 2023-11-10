package creational.abstractfactory;

public class PhoneSeller {
    public static void main(String[] args) {
        S8Factory s8Factory = new S8Factory();
        Phone s8 = s8Factory.getPhone("s8", "2500mah", 4, 5);

        Note8Factory note8Factory = new Note8Factory();
        Phone note8 = note8Factory.getPhone("note8", "3000mah", 5, 7);

        System.out.println(s8);
        System.out.println(note8);

    }
}
