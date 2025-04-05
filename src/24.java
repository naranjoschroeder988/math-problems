import java.util.Scanner;

public class MathProblems {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of operations: ");
        int numOperations = scanner.nextInt();
        
        for (int i = 0; i < numOperations; i++) {
            System.out.println("Operation " + (i + 1) + ":");
            switch (i % 2) {
                case 0:
                    System.out.println("Addition: ");
                    break;
                case 1:
                    System.out.println("Subtraction: ");
                    break;
                default:
                    System.out.println("Division: ");
                    break;
            }
        }

        scanner.close();
    }
}
