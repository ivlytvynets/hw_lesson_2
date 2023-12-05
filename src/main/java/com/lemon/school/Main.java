package com.lemon.school;

public class Main {

  public static void main(String[] args) {
    String name = "Arseniy";
    String row = "AAAAAAAAA";
    int a = 6;
    int b = 3;

    System.out.println(greet(name, row));
    System.out.println(divide(a, b));
    System.out.println(isEven(a));
  }

  public static String greet(String name, String row) {
    printRow(row);
    return "Hello " + name;
  }

  public static int divide(int a, int b) {
    return a / b;
  }

  public static boolean isEven(int a) {
    return a % 2 == 0;
  }

  public static void printRow(String row){
    System.out.println(row);
  }
}