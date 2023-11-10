package creational.abstractfactory;

public class Note8Factory implements PhoneFactory {

    @Override
    public Phone getPhone(String model, String battery, int height, int length) {
        return new Note8(model, battery, height, length);
    }
}
