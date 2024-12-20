package ExceptionHandlings;

import java.util.Scanner;

public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter a numerator (integer):");
            int numerator = scanner.nextInt();

            System.out.println("Enter a denominator (integer):");
            int denominator = scanner.nextInt();

            // Check for division by zero
            if (denominator == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }

            // Perform division
            int result = numerator / denominator;
            System.out.println("Result: " + numerator + " / " + denominator + " = " + result);
        } catch (ArithmeticException e) {
            // Handling division by zero
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            // Handling other input-related exceptions (e.g., invalid data type)
            System.out.println("Error: Please enter valid integers.");
        } finally {
            // Closing the scanner resource
            scanner.close();
        }
    }
}
