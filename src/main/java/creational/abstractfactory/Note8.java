package creational.abstractfactory;

public class Note8 implements Phone {
    private String model;
    private String battery;
    private int height;
    private int length;

    public Note8() {
    }

    public Note8(String model, String battery, int height, int length) {
        this.model = model;
        this.battery = battery;
        this.height = height;
        this.length = length;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getBattery() {
        return battery;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Note8{" +
                "model='" + model + '\'' +
                ", battery='" + battery + '\'' +
                ", height=" + height +
                ", length=" + length +
                '}';
    }
}
