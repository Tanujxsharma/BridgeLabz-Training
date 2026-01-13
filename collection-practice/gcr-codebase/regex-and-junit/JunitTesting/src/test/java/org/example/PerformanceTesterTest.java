package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static java.util.concurrent.TimeUnit.SECONDS;

import org.junit.jupiter.api.Timeout;

public class PerformanceTesterTest {

    private PerformanceTester tester = new PerformanceTester();

    @Test
    @Timeout(value = 2, unit = SECONDS)
    void testLongRunningTaskShouldTimeout() throws InterruptedException {

        String result = tester.longRunningTask();
        assertEquals("Task completed after 3 seconds", result);
    }

    @Test
    @Timeout(value = 2, unit = SECONDS)
    void testFastTaskShouldPass() {
        String result = tester.fastTask();
        assertEquals("Fast task completed", result);
    }
}
