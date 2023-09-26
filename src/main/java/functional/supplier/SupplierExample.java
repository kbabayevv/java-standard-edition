package functional.supplier;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        System.out.println(getName());
        System.out.println(getNameWithSupplier.get());
    }

    static String getName() {
        return "Kamran";
    }

    static Supplier<String> getNameWithSupplier = () -> "Kamran";
}
