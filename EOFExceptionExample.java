package ExceptionHandlings;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.Scanner;

public class EOFExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the file name to read (e.g., test.txt):");
        String fileName = scanner.nextLine();

        try (DataInputStream input = new DataInputStream(new FileInputStream(fileName))) {
            System.out.println("Reading file: " + fileName);

            // Read and print bytes until EOF is reached
            while (true) {
                byte data = input.readByte();
                System.out.print((char) data); // Print each byte as a character
            }
        } catch (EOFException e) {
            // Handling EOFException when reaching the end of the file
            System.out.println("\nEOFException: End of the file reached successfully.");
        } catch (IOException e) {
            // Handling any other I/O related exceptions
            System.out.println("IOException: Unable to read the file. Please ensure the file exists and is readable.");
        } finally {
            // Closing scanner resource
            scanner.close();
        }
    }
}
