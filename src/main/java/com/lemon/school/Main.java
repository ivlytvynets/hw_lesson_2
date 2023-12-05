package com.lemon.school;

public class Main {

  public static void main(String[] args) {

    String greet = greet("Hello Pen");
    System.out.println(greet);

    int divide = divide(10,5);
    System.out.println(divide);

    boolean res = isEven(8);
    System.out.println(res);

    print(greet("Hello Pen"));
  }

  public static String greet(String greet){
    return greet;
  }

  public static int divide(int a, int b){
    return a/b;
  }
  public static boolean isEven(int number){
    return number % 2 == 0;
  }
  public static void print(String m){
     System.out.println(m);
  }
}