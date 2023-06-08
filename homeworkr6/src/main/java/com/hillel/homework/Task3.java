package com.hillel.homework;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int [][]arr = {
                {3,4,5,6,7,8},
                {9,8,7,6,5,4}
        };
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
        System.out.println("First level array sum");

        int firstArr = 0;
        double sumFirstArr = 0;
        for (int i = 0; i < arr[firstArr].length; i++) {
            sumFirstArr += arr[firstArr][i];
        }
        System.out.print(sumFirstArr / 6);

        System.out.println();

        System.out.println("Second level array sum");

        int secondArr = 1;
        double sumSecondArr = 0;
        for (int i = 0; i < arr[secondArr].length; i++) {
            sumSecondArr += arr[secondArr][i];
        }
        System.out.println(sumSecondArr / 6);

        if (sumFirstArr == sumSecondArr) {
            System.out.println("They even");
        }
        if (sumFirstArr > sumSecondArr) {
            System.out.println("First > Second");
        }
        if (sumFirstArr < sumSecondArr) {
            System.out.println("First < Second");
        }
    }
}
