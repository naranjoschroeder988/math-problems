public class MathProblems {

    public static void main(String[] args) {
        // Generate a random math problem
        int num1 = (int)(Math.random() * 10 + 1);
        int num2 = (int)(Math.random() * 10 + 1);
        char op = '+';
        switch ((int)(Math.random() * 3)) {
            case 0:
                op = '+';
                break;
            case 1:
                op = '-';
                break;
            case 2:
                op = '*';
                break;
        }

        // Print the problem and get the user's answer
        System.out.print("What is " + num1 + " " + op + " " + num2 + "? ");
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();

        // Check if the answer is correct
        switch (op) {
            case '+':
                if (answer == num1 + num2) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect. The answer is " + (num1 + num2));
                }
                break;
            case '-':
                if (answer == num1 - num2) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect. The answer is " + (num1 - num2));
                }
                break;
            case '*':
                if (answer == num1 * num2) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect. The answer is " + (num1 * num2));
                }
                break;
        }
    }
}