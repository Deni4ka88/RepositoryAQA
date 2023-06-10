package com.hillel.homework;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        int factorial = number;

        for(int i = (number - 1); i > 1; i--) {
            factorial = factorial * i;
        }
        System.out.println("!n "+ number + "= "+ factorial);
        scanner.close();
    }

}


