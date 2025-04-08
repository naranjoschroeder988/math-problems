import java.util.*;

public class MathProblems {
    public static void main(String[] args) {
        // Define some sample equations and functions here

        // Example: add two numbers
        System.out.println("Result of adding 5 and 3 is: " + add(5, 3));

        // Add another function for checking if a number is even
        boolean isEven = checkIfEven(10);
        System.out.println("Is 10 even? " + isEven);

        // Example: perform some basic arithmetic operations
        double result = computeSquareRoot(9);
        System.out.println("The square root of 9 is: " + result);

        // Randomly generate and display a random number between 1 and 100
        int randomNumber = (int) (Math.random() * 100) + 1;
        System.out.println("Random number between 1 and 100: " + randomNumber);
    }

    // Function to calculate the square root of a given number
    private static double computeSquareRoot(double number) {
        return Math.sqrt(number);
    }

    // Function to check if a number is even
    private static boolean checkIfEven(int number) {
        return number % 2 == 0;
    }
}
