package org.example;

public class PerformanceTester {
    public String longRunningTask() throws InterruptedException {
        Thread.sleep(3000);
        return "Task completed after 3 seconds";
    }
    public String fastTask() {
        return "Fast task completed";
    }
}
