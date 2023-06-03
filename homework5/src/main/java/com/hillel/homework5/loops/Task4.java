package com.hillel.homework5.loops;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int i = scanner.nextInt();
        int sum = 0;
        int currentNumber = i;
        while (currentNumber != 0) {
            sum += currentNumber % 10;
            currentNumber /= 10;
        }
        System.out.println("sum "+ i + " = " + sum);
    }
}
