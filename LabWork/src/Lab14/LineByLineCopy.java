package Lab14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LineByLineCopy {
    public static void main(String[] args) {
        // Specify the source and destination file paths
        String sourceFile = "src/Lab14/input.txt";
        String destinationFile = "src/Lab14/copied.txt";

        // Try-with-resources to automatically close resources
        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile))) {

            String line;
            // Read and write each line
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            System.out.println("File content copied successfully!");

        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
