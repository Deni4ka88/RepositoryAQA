package com.hillel.homework;

public class Task1 {
    public static void main(String[] args) {
        int[] a = new int[21];
        for (int i = 2, j = 2; i < 21; i += j) {
            a[i] += i;
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int[] arr = new int[21];
        for (int i = 2, j = 2; i < 21; i += j) {
            arr[i] += i;
            System.out.println(arr[i]);
//        System.out.println(Arrays.toString(a));
        }
    }
}