package com.lemon.school;

public class Main {
  public static void main(String[] args) {
    //Робота методу 1 - greet
    System.out.print(greet("Hello "));
    String str = "world";
    System.out.print(greet(str));
    String str1 = greet("!!!");
    System.out.println(str1);

    //Робота методу 2 - divide
    System.out.println(divide(12, 2));
    int number = 100, number1 = 50;
    System.out.println(divide(number, number1));



    //Робота методу 3 - isEven
    if (isEven(3)){
      System.out.println("Even");
    }else {
      System.out.println("Odd");
    }

    // Робота методу 3 - print
    String hello = "Hello, ";
    String world = "world";
    String sign = "!!!";
    print(hello);
    print(world);
    print(sign);

  }

  //greet - Привітання. Приймає строку, повертає строку. Приклад: Hello Pen
  public static String greet(String str){
    return str;
  }

  //divide - Ділення. Приймає на вхід 2 цілочисельних значення, повертає ціле число
  // Поправки до коментаря
  public static int divide(int a, int b) {
    if (b == 0) {
      throw new ArithmeticException("Ділення на нуль неможливе");
    }
    return a / b;
  }

  //isEven - Чи парне число. Приймає на вхід ціле число, повертає булеве значення
  //переробить метод або доробить (true or false)
  public static boolean isEven(int number){
    if (number == 0){
      // Я не знав чи потрібно робити перевірку на нуль чи ні, тому добавив
      throw new ArithmeticException("Нуль");
    }else if (number % 2 == 0){
      return true;
    }else {
      return false;
    }
  }

  // Це трохи інша реалізація
  public static boolean isEvenMethod2(int number){
    return number % 2 == 0;
  }

  // print - Вивід на екран строки. Приймає строку, виводить в консоль передану строку. (Передати результат роботи методу greet)
  public static void print(String str){
    System.out.println(str);
  }
}