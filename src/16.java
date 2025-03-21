public class MathProblems {
    public static void main(String[] args) {
        // Example 1: Summing two numbers
        System.out.println("Sum of 3 and 5: " + (3 + 5));

        // Example 2: Multiplying two numbers
        double result = 7 * 4;
        System.out.println("Multiplication of 7 and 4: " + result);

        // Example 3: Checking if a number is even or odd
        boolean isEven = true; // Assume the variable is initially set to false

        while (isEven) {
            isEven = false;
            for (int i = 2; i * i <= 7; i++) {
                if ((i + 1) % 3 == 0) {
                    break;
                }
                isEven = true;
            }
        }

        System.out.println("Is the number 7 even: " + isEven);
    }
}
