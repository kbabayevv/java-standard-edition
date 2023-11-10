package creational.factory;

public class PhoneFactory {
    public static Phone getPhone(String model, String battery, int height, int length) {
        if ("S8".equalsIgnoreCase(model)) {
            return new S8(model, battery, height, length);
        } else if ("Note8".equalsIgnoreCase(model)) {
            return new Note8(model, battery, height, length);
        } else throw new RuntimeException("Model is not valid for this factory");
    }
}
