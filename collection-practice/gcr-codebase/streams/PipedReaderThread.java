package JavaStreams.PipedStreamsCommunication;

import java.io.IOException;
import java.io.PipedInputStream;

public class PipedReaderThread extends Thread {
    private PipedInputStream pis;

    public PipedReaderThread(PipedInputStream pis) {
        this.pis = pis;
    }

    @Override
    public void run() {
        try {
            System.out.println("Reader: Reading data...");
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = pis.read(buffer)) != -1) {
                String receivedMessage = new String(buffer, 0, bytesRead);
                System.out.println("Reader: Received: " + receivedMessage.trim());
            }
            pis.close(); // Close the stream when done reading
            System.out.println("Reader: Finished reading.");
        } catch (IOException e) {
            System.err.println("Reader Error: " + e.getMessage());
        }
    }
}