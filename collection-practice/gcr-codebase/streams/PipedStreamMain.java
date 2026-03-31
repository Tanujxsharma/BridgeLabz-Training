package JavaStreams.PipedStreamsCommunication;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedStreamMain {
    public static void main(String[] args) {
        try {
            PipedOutputStream pos = new PipedOutputStream();
            PipedInputStream pis = new PipedInputStream();

            // Connect the piped streams
            pos.connect(pis);

            // Create and start writer and reader threads
            PipedWriterThread writerThread = new PipedWriterThread(pos);
            PipedReaderThread readerThread = new PipedReaderThread(pis);

            writerThread.start();
            readerThread.start();

            // Wait for both threads to finish
            writerThread.join();
            readerThread.join();

            System.out.println("\nMain: Piped stream communication complete.");

        } catch (IOException e) {
            System.err.println("Main Error: " + e.getMessage());
        } catch (InterruptedException e) {
            System.err.println("Main Interrupted: " + e.getMessage());
            Thread.currentThread().interrupt();
        }
    }
}