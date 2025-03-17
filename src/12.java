import java.util.Random;

public class MathProblem {
    public static int getAnswer(int number1, int number2) {
        Random random = new Random();
        int operation = random.nextInt(4); // 0: addition, 1: subtraction, 2: multiplication, 3: division
        switch (operation) {
            case 0: return number1 + number2;
            case 1: return number1 - number2;
            case 2: return number1 * number2;
            case 3: return number1 / number2;
            default: throw new IllegalStateException("Invalid operation");
        }
    }
}
