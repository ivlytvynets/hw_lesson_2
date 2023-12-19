package com.lemon.school;
public class Main {

    public static void main(String[] args) {
        String s = "Name";
        System.out.println(getGreet());

        int a = 280;
        int b = 140;
        int divide = divide(a, b);

        System.out.println("Результат:" + divide);

        int num1 = 35;
        System.out.println(isEven(num1));

        String greet = "Hello";
        String name = "Bob";
        printInfo(greet, name);
    }

    public static String getGreet() {
        return "Hello Bob";
    }

    public static boolean isEven(int num1) {
        return num1 % 2 == 0;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static void printInfo(String greet, String name) {
        System.out.println("Привітання:" + greet + name);
    }
}