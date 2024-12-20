package ExceptionHandlings;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class IOExceptionExample {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the file name that you want to read (for IOException test):");
            String fileName = scanner.nextLine();

            if (fileName.isBlank()) {
                System.out.println("File name cannot be empty. Please try again.");
                return;
            }

            // Trying to open the specified file
            try (FileReader reader = new FileReader(fileName)) {
                System.out.println("File opened successfully.");
            } catch (FileNotFoundException e) {
                // Handling file not found case
                System.out.println("FileNotFoundException: The file you want to access does not exist!");
            } catch (IOException e) {
                // Handling other IOExceptions
                System.out.println("IOException: An error occurred while accessing the file: " + e.getMessage());
            }
        }
    }
}
