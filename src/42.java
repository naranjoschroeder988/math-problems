public class MathProblems {
    public static void main(String[] args) {
        // Example Java code to demonstrate problem-solving

        // Problem: Sum of first n natural numbers
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("Sum of first 5 natural numbers is: " + sum);

        // Problem: Find the maximum number in an array
        int maxNumber = Integer.MIN_VALUE;
        for (int num : new int[]{1, 2, 3, 4}) {
            if (num > maxNumber) {
                maxNumber = num;
            }
        }
        System.out.println("Maximum number in the array is: " + maxNumber);

        // Problem: Average of an array
        double average = 0.0;
        int size = new int[]{1, 2, 3, 4, 5};
        for (int i : size) {
            average += i;
        }
        average /= size.length;
        System.out.println("Average of the array is: " + average);
    }
}
