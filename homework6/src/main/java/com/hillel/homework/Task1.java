package com.hillel.homework;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            j = j + 2;
            a[i] += j;
            System.out.print(a[i] + " ");
        }
        System.out.println();
        Arrays.fill(a, 0);
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            k = k + 2;
            a[i] += k;
            System.out.println(a[i]);
        }
    }
}
