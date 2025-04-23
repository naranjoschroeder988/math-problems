public class MathProblems {
    public static void main(String[] args) {
        // Example calculation: adding 2 to each number in an array
        int[] numbers = {1, 2, 3};
        System.out.println(Arrays.stream(numbers).map(num -> num + 2).sum());
        
        // Example for calculating Fibonacci sequence
        long a = 0;
        long b = 1;
        System.out.println(fibonacci(a, b));
    }

    public static long fibonacci(int n, int first) {
        if (n <= 1) return first;
        return fibonacci(n - 1, first + fibonacci(n - 2, 1));
    }
}
