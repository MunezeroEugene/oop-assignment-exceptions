package ExceptionHandlings;

import java.util.Scanner;

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a value (non-numeric to test NumberFormatException):");
            String input = scanner.nextLine();

            if (input.isBlank()) {
                System.out.println("Input cannot be empty. Please enter a valid value.");
                return;
            }

            try {
                // Attempt to parse the input as an integer
                int number = Integer.parseInt(input);
                System.out.println("Parsing successful! You entered the number: " + number);
            } catch (NumberFormatException e) {
                // Handling NumberFormatException
                System.out.println("NumberFormatException: \"" + input + "\" is not a valid integer.");
                System.out.println("Explanation: This exception occurs when you try to parse a non-numeric string as a number.");
            }
        }
    }
}
