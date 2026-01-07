
package JavaStreams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;

public class BufferedStreamCopy {

    private static final int BUFFER_SIZE = 4096; // 4 KB

    public static void main(String[] args) {
        String sourceFilePath = "D:\\BridgeLabz-SIPP-Training\\JavaStreams\\large_source.txt";
        String destinationBufferedPath = "D:\\BridgeLabz-SIPP-Training\\JavaStreams\\large_destination_buffered.txt";
        String destinationUnbufferedPath = "lD:\\BridgeLabz-SIPP-Training\\JavaStreams\\large_destination_unbuffered.txt";

        // Create a dummy large source file for demonstration
        createDummyLargeFile(sourceFilePath, 10 * 1024 * 1024); // 10 MB file

        System.out.println("Starting file copy with buffered streams...");
        long bufferedTime = copyFileBuffered(sourceFilePath, destinationBufferedPath);
        System.out.println("Buffered copy completed in " + bufferedTime + " ns");

        System.out.println("\nStarting file copy with unbuffered streams...");
        long unbufferedTime = copyFileUnbuffered(sourceFilePath, destinationUnbufferedPath);
        System.out.println("Unbuffered copy completed in " + unbufferedTime + " ns");

        System.out.println("\nPerformance comparison:");
        System.out.println("Buffered stream was " + (double) unbufferedTime / bufferedTime + " times faster than unbuffered stream.");
    }

    private static void createDummyLargeFile(String filePath, long size) {
        File file = new File(filePath);
        if (file.exists()) {
            System.out.println("Dummy large file already exists: " + filePath);
            return;
        }
        System.out.println("Creating dummy large file: " + filePath + " (" + size / (1024 * 1024) + " MB)...");
        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            byte[] data = new byte[BUFFER_SIZE];
            for (long i = 0; i < size / BUFFER_SIZE; i++) {
                fos.write(data);
            }
            System.out.println("Dummy large file created.");
        } catch (IOException e) {
            System.err.println("Error creating dummy file: " + e.getMessage());
        }
    }

    private static long copyFileBuffered(String sourcePath, String destinationPath) {
        long startTime = System.nanoTime();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourcePath), BUFFER_SIZE);
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destinationPath), BUFFER_SIZE)) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.err.println("Error during buffered copy: " + e.getMessage());
        }
        return System.nanoTime() - startTime;
    }

    private static long copyFileUnbuffered(String sourcePath, String destinationPath) {
        long startTime = System.nanoTime();
        try (FileInputStream fis = new FileInputStream(sourcePath);
             FileOutputStream fos = new FileOutputStream(destinationPath)) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.err.println("Error during unbuffered copy: " + e.getMessage());
        }
        return System.nanoTime() - startTime;
    }
}