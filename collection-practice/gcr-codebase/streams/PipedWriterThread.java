package JavaStreams.PipedStreamsCommunication;

import java.io.IOException;
import java.io.PipedOutputStream;

public class PipedWriterThread extends Thread {
    private PipedOutputStream pos;

    public PipedWriterThread(PipedOutputStream pos) {
        this.pos = pos;
    }

    @Override
    public void run() {
        try {
            System.out.println("Writer: Writing data...");
            for (int i = 0; i < 5; i++) {
                String message = "Message " + i + "\n";
                pos.write(message.getBytes());
                System.out.println("Writer: Sent: " + message.trim());
                Thread.sleep(500); // Simulate some work
            }
            pos.close(); // Close the stream when done writing
            System.out.println("Writer: Finished writing.");
        } catch (IOException e) {
            System.err.println("Writer Error: " + e.getMessage());
        } catch (InterruptedException e) {
            System.err.println("Writer Interrupted: " + e.getMessage());
            Thread.currentThread().interrupt();
        }
    }
}