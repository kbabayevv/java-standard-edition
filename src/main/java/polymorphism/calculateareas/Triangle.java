package polymorphism.calculateareas;

public class Triangle extends Shape {
    private double aSide;
    private double bSide;
    private double cSide;

    public Triangle(double aSide, double bSide, double cSide) {
        this.aSide = aSide;
        this.bSide = bSide;
        this.cSide = cSide;
    }

    public double getaSide() {
        return aSide;
    }

    public double getbSide() {
        return bSide;
    }

    public double getcSide() {
        return cSide;
    }

    @Override
    public double calculateArea() {
        double s = (aSide + bSide + cSide) / 2;
        return Math.sqrt(s * (s - aSide) * (s - bSide) * (s - cSide));
    }

}
