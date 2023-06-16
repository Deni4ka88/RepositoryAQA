package com.hillel;

import java.util.Scanner;

public class Function {
    public static int getInt(Scanner scanner) {
         return  scanner.nextInt();
    }

    public static char getOperation(Scanner scanner) {
        return scanner.nextLine().charAt(0);
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
