package com.hillel;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int num1 = Function.getInt(scanner);

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter number");
        int num2 = Function.getInt(scanner1);

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter method");
        char operation = Function.getOperation(scanner2);

        int result = Function.calc(num1,num2,operation);
        System.out.println(result);
    }
}
