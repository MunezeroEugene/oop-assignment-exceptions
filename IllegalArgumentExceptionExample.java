package ExceptionHandlings;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IllegalArgumentExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;

        while (!validInput) {
            try {
                // Prompting the user to enter a number for testing
                System.out.println("Enter a negative number (for IllegalArgumentException test):");
                int age = scanner.nextInt();

                // Checking for an invalid age value
                if (age < 0) {
                    throw new IllegalArgumentException("Age cannot be negative.");
                }
                System.out.println("Age is valid.");
                validInput = true; // Exit loop on valid input
            } catch (IllegalArgumentException e) {
                // Handling IllegalArgumentException
                System.out.println("IllegalArgumentException: " + e.getMessage());
            } catch (InputMismatchException e) {
                // Handling non-numeric input
                System.out.println("InputMismatchException: Please enter a valid integer.");
                scanner.nextLine(); // Clear invalid input
            }
        }
        scanner.close(); // Closing the scanner
    }
}
