package com.hillel;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        int firstNum = Function.getInt();
        int secondNum = Function.getInt();
        char operation = Function.getOperation();
        int result = Function.calc(firstNum,secondNum,operation);
        System.out.println(result);
    }
}
