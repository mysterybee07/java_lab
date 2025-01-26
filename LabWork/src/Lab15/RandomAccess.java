package Lab15;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccess {
    public static void main(String[] args) {
        String fileName = "src/Lab15/input.txt";

        try (RandomAccessFile raf = new RandomAccessFile(fileName, "rw")) {
            // Clear any existing content for demonstration purposes
            raf.setLength(0);

            // Write data to the file at specific positions using fixed-size strings
            raf.seek(0);                // Move to position 0
            raf.writeBytes("Hi,     "); // Ensure fixed size (8 bytes with padding)
            raf.seek(20);               // Move to position 20
            raf.writeBytes("This is a "); // Ensure fixed size (10 bytes)
            raf.seek(10);               // Move to position 10
            raf.writeBytes("Java Lab  "); // Ensure fixed size (10 bytes)

            // Read the data back from the file
            byte[] buffer = new byte[8];
            raf.seek(0); // Read from position 0
            raf.read(buffer);
            System.out.println("First read: " + new String(buffer).trim());

            buffer = new byte[10];
            raf.seek(10); // Read from position 10
            raf.read(buffer);
            System.out.println("Second read: " + new String(buffer).trim());

            raf.seek(20); // Read from position 20
            raf.read(buffer);
            System.out.println("Third read: " + new String(buffer).trim());

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
