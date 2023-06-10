package com.hillel.homeworX.CastomerArray;

import java.util.Random;
import java.util.Scanner;

public class CustomerArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantity of cell");
        int n = scanner.nextInt();
        int[] j = new int[n];
        Random random = new Random();

        for (int i = 0; i < j.length; i++) {
            j[i] = random.nextInt(99);
            System.out.print(j[i] + " ");
        }
        System.out.println();

        int max = j[0];
        for (int l : j) {
            if (l > max) {
                max = l;
            }
        }
        System.out.println("max value " + max);

        int min = j[0];
        for (int l : j) {
            if (l < min) {
                min = l;
            }
        }
        System.out.println("min value " + min);

        int sumArr = 0;
        for (int l : j) {
            sumArr += l;
        }
        System.out.println("Sum " + sumArr);

        double averageArr = 0;
        for (int l : j) {
            averageArr += l;
        }
        System.out.println("Average " + averageArr / j.length);

        System.out.print("Not multiples => ");
        for (int l : j) {
            if (l % 2 != 0) {
                System.out.print(l + " ");
            }
        }
    }
}
