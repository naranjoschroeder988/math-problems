
package com.mathproblems;

import java.util.Random;

public class RandomMathProblem {
  private static final int MIN_NUMBER = 1;
  private static final int MAX_NUMBER = 100;

  public String generate() {
    Random random = new Random();
    int a = random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;
    int b = random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;
    char operator = (char) (random.nextInt(3) + '+');

    return String.format("What is %d %s %d?", a, operator, b);
  }
}