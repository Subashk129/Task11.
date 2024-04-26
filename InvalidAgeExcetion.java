package javaBasic.Task11;

import java.util.Scanner;

// Custom exception class for invalid age
class InvalidAgeException extends Exception {
    public InvalidAgeException() {
        super("Error: Age must be 18 or higher.");
    }
}

public class InvalidAgeExcetion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        try {
            validateAge(age);
            System.out.println("Age validation successful!");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage()); 
        }

        scanner.close();
    }

    // Method to validate age
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException();
        }
    }
}