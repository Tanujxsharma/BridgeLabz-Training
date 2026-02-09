package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testAddNumbers() {
        App app = new App();

        int result = app.addNumbers(2, 3);

        assertEquals(5, result);
    }
}
