package com.lemon.school;

public class Main {

    public static void main(String[] args) {
        System.out.println(getgreet());

        int a = 280;
        int b = 140;
        int a1 = 555;
        int b1 = 230;
        int a2 = 950;
        int b2 = 240;
        int divide = getDivide(a, b);
        int divide1 = getDivide(a1, b1);
        int divide2 = getDivide(a2, b2);
        System.out.println("Результат:" + divide + "Результат:" + divide1 + "Результат:" + divide2);


        int num1 = 33;
        System.out.println(isEven(num1));


        String Hello = "Hello";
        String Bob = "Bob";
        System.out.print(Hello);
        System.out.print(Bob);


    }

    public static String getgreet() {
        return "Hello Bob";
    }

    public static int getDivide(int a, int b) {
        return a / b;
    }

    public static boolean isEven(int num1) {
        return num1 % 2 == 0;
    }

    int getDivide1(int a1, int b1) {
        return a1 / b1;
    }

    int getDivide2(int a2, int b2) {
        return a2 / b2;
    }
}












