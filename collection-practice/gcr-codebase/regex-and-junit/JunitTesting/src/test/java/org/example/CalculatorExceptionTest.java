package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorExceptionTest {

    @Test
    void testDivideByZeroThrowsException() {
        CalculatorException calc = new CalculatorException();
        ArithmeticException exception = assertThrows(
                ArithmeticException.class,
                ()->calc.divide(10, 0)
        );
        assertEquals("Division by zero is not allowed",exception.getMessage());
    }

    @Test
    void testDivideValidNumbers() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.divide(10, 2));
    }
}
