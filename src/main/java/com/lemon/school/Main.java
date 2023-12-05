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
    System.out.println(divide(12));
    int number = 100;
    System.out.println(divide(number));
    int number1 = divide(200);
    System.out.println(number1);


    //Робота методу 3 - isEven
    System.out.println(isEven(2));
    int number2 = 3;
    System.out.println(isEven(number2));
    String evenOrOdd = isEven(5);
    System.out.println(evenOrOdd);

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
  public static int divide(int number){
    return number / 2;
  }

  //isEven - Чи парне число. Приймає на вхід ціле число, повертає булеве значення
  public static String isEven(int number){
    if (number == 0){
      // Я не знав чи потрібно робити перевірку на нуль чи ні, тому добавив
      return "Zero";
    }else if (number % 2 == 0){
      return "Even";
    }else {
      return "Odd";
    }
  }

  // print - Вивід на екран строки. Приймає строку, виводить в консоль передану строку. (Передати результат роботи методу greet)
  public static void print(String str){
    System.out.println(str);
  }
}