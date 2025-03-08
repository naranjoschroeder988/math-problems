import java.util.Random;

public class MathProblem {
  private static Random random = new Random();

  public int getAnswer(int x, int y) {
    // Generate a random problem between x and y
    int problem = random.nextInt(y - x + 1) + x;
    return problem;
  }
}
