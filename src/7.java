import java.util.Random;

public class MathProblems {
    public static int generateRandomMathProblem(int difficulty) {
        Random rand = new Random();
        int a = rand.nextInt(10);
        int b = rand.nextInt(10);
        switch (difficulty) {
            case 1:
                return a + b;
            case 2:
                return a - b;
            case 3:
                return a * b;
            default:
                return a / b;
        }
    }
}