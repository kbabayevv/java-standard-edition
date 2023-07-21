package objectandclass;

public class Point {
    private int x;
    private int y;

    public static void main(String[] args) {

        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

    public double distance(int x, int y) {
        int xA = this.x - x;
        int yB = this.y - y;
        return Math.sqrt(xA * xA + yB * yB);
    }

    public double distance(Point point) {
        int xA = this.x - point.getX();
        int yB = this.y - point.getY();
        return Math.sqrt(xA * xA + yB * yB);
    }

}
