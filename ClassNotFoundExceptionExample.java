package ExceptionHandlings;

import java.util.Scanner;

public class ClassNotFoundExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a fully qualified class name to load (e.g., java.util.ArrayList):");
        String className = scanner.nextLine();

        try {
            // Attempting to load a class dynamically
            Class<?> loadedClass = Class.forName(className);
            System.out.println("Class loaded successfully: " + loadedClass.getName());
        } catch (ClassNotFoundException e) {
            // Handling ClassNotFoundException
            System.out.println("Error: ClassNotFoundException - The specified class '" + className + "' was not found.");
        } catch (Exception e) {
            // Handling any unexpected exceptions
            System.out.println("Error: An unexpected error occurred while trying to load the class.");
        } finally {
            // Closing the scanner resource
            scanner.close();
        }
    }
}
