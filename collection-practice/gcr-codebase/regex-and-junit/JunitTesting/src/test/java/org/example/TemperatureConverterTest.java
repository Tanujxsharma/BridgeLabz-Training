package org.example;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest {
    private TemperatureConverter converter;

    @BeforeEach
    void setUp() {
        converter = new TemperatureConverter();
    }


    @Test
    void testZeroCelsiusToFahrenheit() {
        assertEquals(32.0, converter.celsiusToFahrenheit(0.0), 0.001);
    }

    @Test
    void testFreezingPointCelsiusToFahrenheit() {
        assertEquals(32.0, converter.celsiusToFahrenheit(0.0), 0.001);
    }

    @Test
    void testBoilingPointCelsiusToFahrenheit() {
        assertEquals(212.0, converter.celsiusToFahrenheit(100.0), 0.001);
    }

    @Test
    void testRoomTemperatureCelsiusToFahrenheit() {
        assertEquals(68.0, converter.celsiusToFahrenheit(20.0), 0.001);
    }

    @Test
    void testNegativeCelsiusToFahrenheit() {
        assertEquals(-4.0, converter.celsiusToFahrenheit(-20.0), 0.001);
    }

    @Test
    void testZeroFahrenheitToCelsius() {
        assertEquals(-17.778, converter.fahrenheitToCelsius(0.0), 0.001);
    }

    @Test
    void testFreezingPointFahrenheitToCelsius() {
        assertEquals(0.0, converter.fahrenheitToCelsius(32.0), 0.001);
    }

    @Test
    void testBoilingPointFahrenheitToCelsius() {
        assertEquals(100.0, converter.fahrenheitToCelsius(212.0), 0.001);
    }

    @Test
    void testRoomTemperatureFahrenheitToCelsius() {
        assertEquals(20.0, converter.fahrenheitToCelsius(68.0), 0.001);
    }

    @Test
    void testNegativeFahrenheitToCelsius() {
        assertEquals(-28.889, converter.fahrenheitToCelsius(-20.0), 0.001);
    }

    @Test
    void testCelsiusToFahrenheitToCelsius() {
        double originalCelsius = 25.0;
        double fahrenheit = converter.celsiusToFahrenheit(originalCelsius);
        double backToCelsius = converter.fahrenheitToCelsius(fahrenheit);
        assertEquals(originalCelsius, backToCelsius, 0.1); // Small tolerance for rounding
    }

    @Test
    void testFahrenheitToCelsiusToFahrenheit() {
        double originalFahrenheit = 77.0;
        double celsius = converter.fahrenheitToCelsius(originalFahrenheit);
        double backToFahrenheit = converter.celsiusToFahrenheit(celsius);
        assertEquals(originalFahrenheit, backToFahrenheit, 0.1);
    }
}
