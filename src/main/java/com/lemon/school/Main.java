package com.lemon.school;

public class Main {

    public static void main(String[] args) {
        String s = "Name";
        System.out.println(Name());

        int a = 280;
        int b = 140;
        int a1 = 555;
        int b1 = 230;
        int a2 = 950;
        int b2 = 240;
        int divide = Divide(a, b);

        System.out.println("Результат:" + divide);

        int num1 = 40;
        System.out.println(isEven(num1));

        String Hello = "Hello";
        String Bob = "Bob";
        System.out.print(Hello);
        System.out.print(Bob);
    }

    public static String Name() {
        return "Hello Bob";
    }

    public static boolean isEven(int num1) {
        return num1 % 2 == 0;
    }

    public static int Divide(int a, int b) {
        return a / b;
    }
}