public class MathProblems {
    public static void main(String[] args) {
        // Example problem 1: Find the greatest common divisor (GCD)
        int num1 = 24;
        int num2 = 36;
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + findGCD(num1, num2));
        
        // Example problem 2: Calculate the area of a triangle
        double base = 5.0;
        double height = 3.0;
        double area = calculateArea(base, height);
        System.out.println("The area of the triangle is: " + area);
    }
    
    public static int findGCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
    
    public static double calculateArea(double base, double height) {
        return base * height / 2.0;
    }
}
