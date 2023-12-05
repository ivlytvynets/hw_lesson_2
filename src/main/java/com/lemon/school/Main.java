package com.lemon.school;

public class Main {

  public static void main(String[] args) {
   String greeting = greet("Sarah!");
   String greeting1 = greet("Anna!");
   String greeting2 = greet("Den!");

   print(greeting);
  print(greeting1);
   print(greeting2);

  /* System.out.println(greeting);
   System.out.println(greeting1);
   System.out.println(greeting2);*/

   int a = 4;
   int b = 2;
   int divide = divide(a, b);
   System.out.println("Result is:" + divide);

   b -= 1;
   int divide2 = divide(a, b);
      System.out.println("Result is:" + divide2);

      a += 2;
      int divide3 = divide(a, b);
      System.out.println("Result is:" + divide3);

      int c1 = 4;
      int c2 = 7;
      int c3 = 0;
      boolean result1 = isEven(c1);
      boolean result2 = isEven(c2);
      boolean result3 = isEven(c3);
    System.out.println("Is even number? " + result1);
      System.out.println("Is even number? " + result2);
      System.out.println("Is even number? " + result3);
  }

    public static void print(String term) {
        System.out.println(term);
    }

  public static String greet(String name){
      return "Hello, " + name;
  }
  public static int divide(int a, int b){
      return a / b;
  }

  public static boolean isEven(int c){
      return c % 2 == 0;
}


}