
import java.util.Random;
public class MathProblems{
  public int getRandomMathProblem(){
    Random rand = new Random();
    int num1=rand.nextInt(20)+1;
    int num2=rand.nextInt(11);
    return num1*num2;
}
public void printResult(int result){
System.out.println(result);
}
}