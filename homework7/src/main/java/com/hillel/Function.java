package com.hillel;

import java.util.Scanner;

public class Function {
    public static int getInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }

    public static char getOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter math method");
        char operation = scanner.nextLine().charAt(0);
        scanner.close();
        return operation;
    }

    public static int calc(int num1, int num2, char operation) {
        int result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            default:
                throw new IllegalArgumentException("unknown operation: " + operation);
        }
        return result;
    }
}
