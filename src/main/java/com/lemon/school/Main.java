package com.lemon.school;

public class Main {

  public static void main(String[] args) {
    System.out.println(greet("Serhii"));//#1 (Just hello with asked name)
    System.out.println(greet("Vika"));
    System.out.println(greet("Ksenia"));

    System.out.println(divide(145, 10));//#2 (If first number1 bigger than number2 or equal, we divide them)
    System.out.println(divide(5, 5));
    System.out.println(divide(320, 20));

    System.out.println(isEven(1545));//#3 (Recognizing number evens using 'remainder division')
    System.out.println(isEven(12));
    System.out.println(isEven(100));

    print("Tolik");//#4 (I think, I don't understand this exercise correctly)
    print("Vasya");// (But anyway, I just get "Hello" from another method, like transmit)
    print("Grisha");
  }

  public static String greet(String name){
    return "Hello " + name + " !";
  }

  public static int divide(int num1, int num2){
    if (num1 >= num2) {
      return num1 / num2;
    }
    return 0;
  }

  public static boolean isEven(int num){
    boolean result;
    if (num % 2 == 0 ){
      result = true;
    }
    else {
      result = false;
    }
    return result;
  }

  public static String print(String name){
    String str = greet(name);
    System.out.println(str);
    return str;
  }

}