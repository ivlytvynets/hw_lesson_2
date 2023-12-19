package com.lemon.school;

public class Main {

  public static void main(String[] args) {
      String text = greet(" Pen, ");
      System.out.println(text);
      String text1 = greet(" Monica, ");
      System.out.println(text1);
      String text2 = greet(" Lera");
      System.out.println(text2);
      int c = divide(20, 2);
      System.out.println("divide= " + c);
      int c1 = divide(27, 3);
      System.out.println("divide= " + c1);
      int c2 = divide(100, 5);
      System.out.println("divide= " + c2);
      boolean result = isEven(8);
      System.out.println("So: " + result);
      boolean result1 = isEven(20);
      System.out.println("So: " + result1);
      boolean result2 = isEven(19);
      System.out.println("So: " + result2);
      printInfo(text, text1, text2);
    }

    public static String greet(String name) {
      String text = "Hello" + name;
      return text;
    }

    public static int divide(int a, int b) {
      return a / b;
    }

    public static boolean isEven(int d) {
      if (d % 2 == 0) {
        System.out.println("Even number");
        return true;
      } else {
        System.out.println("An odd number");
        return false;
      }
    }

    public static void printInfo(String text, String text1, String text2) {
      System.out.println("Text: " + text + "Text1: " + text1 + "Text2: " + text2);
    }
  }