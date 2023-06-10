package com.hillel.homework;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[50];
        int t = 99;
        for (int i = arr.length - 1; i >= 0; i -= 1, t -= 2) {
            arr[i] = t;
            System.out.print(arr[i] + " ");
        }
    }
}
