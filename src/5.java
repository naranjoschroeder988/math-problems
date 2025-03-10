package com.yourcompany;

public class MathProblems {
    public static String getRandomMathProblem() {
        // Generate a random number between 1 and 10
        int num1 = (int) (Math.random() * 10 + 1);
        int num2 = (int) (Math.random() * 10 + 1);
        String operator = "+-*/".charAt((int) (Math.random() * 4));
        switch (operator) {
            case '+':
                return num1 + "+" + num2 + "=";
            case '-':
                return num1 + "-" + num2 + "=";
            case '*':
                return num1 + "*" + num2 + "=";
            case '/':
                return num1 + "/" + num2 + "=";
        }
        return null;
    }
}
