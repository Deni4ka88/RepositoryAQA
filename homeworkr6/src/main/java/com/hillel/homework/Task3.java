package com.hillel.homework;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int[] arr1 = {3, 4, 5, 6, 8, 9};
        int[] arr2 = {9, 8, 7, 6, 5, 4};


        for (int j : arr1) {
            System.out.print(j + " ");
        }
        System.out.println();

        for (int j : arr2) {
            System.out.print(j + " ");
        }
        System.out.println();

        System.out.println("First array sum");

        double sumFirstArr = 0;
        for (int j : arr1) {
            sumFirstArr += j;
        }
        System.out.print(sumFirstArr / arr1.length);

        System.out.println();

        System.out.println("Second array sum");


        double sumSecondArr = 0;
        for (int j : arr2) {
            sumSecondArr += j;
        }
        System.out.println(sumSecondArr / arr2.length);

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
