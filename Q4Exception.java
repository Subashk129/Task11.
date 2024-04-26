package javaBasic.Task11;

import java.util.Scanner;

public class Q4Exception {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the first integer
        System.out.print("Enter the first integer: ");
        int dividend = scanner.nextInt();

        // Read the second integer
        System.out.print("Enter the second integer: ");
        int divisor = scanner.nextInt();

        try {
            // Perform division
            int result = divide(dividend, divisor);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            // Handle division by zero exception
            System.out.println("Error: Cannot divide by zero.");
        }
    }

    // Method for division
    public static int divide(int dividend, int divisor) {
        return dividend / divisor;
    }
}

