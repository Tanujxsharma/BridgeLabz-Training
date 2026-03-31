package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    // @BeforeEach runs before EVERY single test method.
    // This ensures we have a fresh Calculator object for every test.
//    @BeforeEach
//    void setUp() {
//        calculator = new Calculator();
//    }

    @Test
    @DisplayName("Test 1: Simple Addition")
    void testAdd() {
        // checks if 5 + 3 equals 8
        assertEquals(8, calculator.add(5, 3), "5 + 3 should equal 8");
    }

    @Test
    @DisplayName("Test 2: Simple Subtraction")
    void testSubtract() {

        assertEquals(6, calculator.subtract(10, 4), "10 - 4 should equal 6");
    }

    @Test
    @DisplayName("Test 3: Simple Multiplication")
    void testMultiply() {
        // checks if 6 * 2 equals 12
        assertEquals(12, calculator.multiply(6, 2), "6 * 2 should equal 12");
    }

    @Test
    @DisplayName("Test 4: Simple Division")
    void testDivide() {
        // checks if 10 / 2 equals 5
        assertEquals(5, calculator.divide(10, 2), "10 / 2 should equal 5");
    }

    @Test
    @DisplayName("Test 5: Division by Zero Exception")
    void testDivideByZero() {
        // assertThrows checks if the specific code inside the lambda () -> {} throws the expected error.
        // If NO exception is thrown, this test will FAIL.
        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        }, "Dividing by zero should throw an ArithmeticException");
    }
}
