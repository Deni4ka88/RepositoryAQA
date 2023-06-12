package com.hillel.homework;

public class Task1_1 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            j = j + 2;
            a[i] += j;
            System.out.print(a[i] + " ");
        }
    }
}
