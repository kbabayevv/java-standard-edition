package calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;


public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void whenGivenAAndBThenSum() {
        //Act
        double a = 10.5;
        double b = 5.3;
        double c = 15.8;

        //Arrange
        double result = calculator.sum(a, b);

        //Assert
        assertThat(result).isEqualTo(c);
    }

    @Test
    public void whenGivenAAndBThenSubtract() {
        //Act
        double a = -10.5;
        double b = -5.5;
        double c = -5.0;

        //Arrange
        double result = calculator.subtract(a, b);

        //Assert
        assertThat(result).isEqualTo(c);
    }

    @Test
    public void whenGivenAAndBThenMultiply() {
        //Act
        double a = -10;
        double b = -5.5;
        double c = 55;

        //Arrange
        double result = calculator.multiply(a, b);

        //Assert
        assertThat(result).isEqualTo(c);
    }

    @Test
    public void whenGivenAAndBThenDivideSuccess() {
        //Act
        int a = 10;
        int b = -5;
        double c = -2;

        //Arrange
        double result = calculator.divide(a, b);

        //Assert
        assertThat(result).isEqualTo(c);
    }

    @Test
    public void whenGivenAAndBThenDivideException() {
        // Arrange
        int a = 10;
        int b = 0;

        // Act & Assert
        assertThatThrownBy(() -> calculator.divide(a, b))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("/ by zero");
    }
}