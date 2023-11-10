package creational.abstractfactory;

public class S8Factory implements PhoneFactory {

    @Override
    public Phone getPhone(String model, String battery, int height, int length) {
        return new S8(model, battery, height, length);
    }
}
