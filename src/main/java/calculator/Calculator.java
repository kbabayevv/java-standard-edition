package calculator;

public class Calculator {

    public double sum(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.divide(10,0);
    }
}
