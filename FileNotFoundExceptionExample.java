package ExceptionHandlings;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFoundExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the file name to open (for FileNotFoundException test):");
        String fileName = scanner.nextLine();

        try {
            if (fileName.isBlank()) {
                System.out.println("File name cannot be empty. Please try again.");
                return;
            }
            // Attempting to open the file
            System.out.println("Checking for the file...");
            FileInputStream file = new FileInputStream(fileName);
            System.out.println("File opened successfully.");
        } catch (FileNotFoundException e) {
            // Handling the case where the file is not found
            System.out.println("FileNotFoundException: The specified file was not found.");
        } finally {
            // Closing the Scanner
            scanner.close();
        }
    }
}
