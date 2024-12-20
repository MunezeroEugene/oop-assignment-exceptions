package ExceptionHandlings;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Array elements are: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + " -> Value: " + numbers[i]);
        }

        System.out.println("\nEnter an index to access an element in the array:");
        try {
            int index = scanner.nextInt();

            // Validating if the index is within range
            if (index < 0 || index >= numbers.length) {
                throw new ArrayIndexOutOfBoundsException("Index " + index + " is out of bounds for array of size " + numbers.length + ".");
            }
            // Accessing the array element
            System.out.println("The value at index " + index + " is: " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handling invalid index input
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            // Handling invalid input type
            System.out.println("Error: Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}
