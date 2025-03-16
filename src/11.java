import java.util.Scanner;
public class MathProblem {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b;
    System.out.println("Enter two numbers to find their sum:");
    a = sc.nextInt();
    b = sc.nextInt();
    System.out.println("Sum of the two numbers is: " + (a + b));
  }
}