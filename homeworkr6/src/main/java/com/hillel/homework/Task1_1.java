package com.hillel.homework;

public class Task1_1 {
    public static void main(String[] args) {
        int[] a = new int[21];
        for (int i = 2; i < 21; i++) {
            if (i % 2 == 0) {
                a[i] = i;
                System.out.print(a[i] + " ");
            }
        }
    }
}