  package com.example;

  public class MathProblems {
      public static int randomNum(int min, int max) {
          if (min >= max) {
              throw new IllegalArgumentException("max must be greater than min");
          }
          return (int)(Math.random() * (max - min + 1)) + min;
      }
  }