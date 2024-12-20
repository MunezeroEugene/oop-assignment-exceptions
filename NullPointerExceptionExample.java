package ExceptionHandlings;

import java.util.Scanner;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a string (or press Enter to simulate a null string for NullPointerException test):");
            String str = scanner.nextLine();

            if (str.isBlank()) {
                // Simulate a null reference
                str = null;
            }

            try {
                // Attempt to access the length of the string
                System.out.println("The length of the string is: " + str.length());
            } catch (NullPointerException e) {
                // Handle the NullPointerException
                System.out.println("NullPointerException: Cannot call methods on a null reference!");
                System.out.println("Explanation: You attempted to call the `length()` method on a null object.");
            }
        }
    }
}
