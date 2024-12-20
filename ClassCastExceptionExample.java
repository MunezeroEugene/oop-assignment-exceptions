package ExceptionHandlings;

import java.util.Scanner;

public class ClassCastExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer (to demonstrate ClassCastException):");
        int number = scanner.nextInt();

        try {
            // Demonstrating improper casting that leads to a ClassCastException
            Object obj = number; // Boxed as Object
            String str = (String) obj; // Invalid cast: Object to String
        } catch (ClassCastException e) {
            // Handling ClassCastException
            System.out.println("Error: Cannot cast an Integer to a String.");
        } finally {
            // Closing the scanner
            scanner.close();
        }
    }
}
