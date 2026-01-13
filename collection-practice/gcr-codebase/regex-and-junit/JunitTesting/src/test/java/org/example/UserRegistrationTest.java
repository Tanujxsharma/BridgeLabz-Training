package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class UserRegistrationTest {
    private final UserRegistration registration = new UserRegistration();
    @Test
    void testValidUserRegistration() {
        String result = registration.registerUser("john_doe", "john@example.com", "Password123");
        assertEquals("User john_doe registered successfully", result);
    }

    @Test
    void testValidUserWithComplexEmail() {
        String result = registration.registerUser("alice123", "alice.test+tag@domain.co.in", "SecurePass456");
        assertEquals("User alice123 registered successfully", result);
    }


    @Test
    void testShortUsernameThrowsException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> registration.registerUser("ab", "test@example.com", "Password123")
        );
        assertEquals("Username must be at least 3 characters", exception.getMessage());
    }

    @Test
    void testNullUsernameThrowsException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> registration.registerUser(null, "test@example.com", "Password123")
        );
        assertEquals("Username must be at least 3 characters", exception.getMessage());
    }


    @Test
    void testInvalidEmailFormatThrowsException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> registration.registerUser("validuser", "invalid-email", "Password123")
        );
        assertEquals("Email must be valid format", exception.getMessage());
    }

    @Test
    void testNullEmailThrowsException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> registration.registerUser("validuser", null, "Password123")
        );
        assertEquals("Email must be valid format", exception.getMessage());
    }

    @Test
    void testShortPasswordThrowsException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> registration.registerUser("validuser", "test@example.com", "short")
        );
        assertEquals("Password must be 8+ chars with uppercase, lowercase, and digit", exception.getMessage());
    }

    @Test
    void testPasswordNoUppercaseThrowsException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> registration.registerUser("validuser", "test@example.com", "lowercase123")
        );
        assertEquals("Password must be 8+ chars with uppercase, lowercase, and digit", exception.getMessage());
    }

    @Test
    void testPasswordNoDigitThrowsException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> registration.registerUser("validuser", "test@example.com", "PasswordABC")
        );
        assertEquals("Password must be 8+ chars with uppercase, lowercase, and digit", exception.getMessage());
    }
}
