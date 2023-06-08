package com.hillel.homework;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = arr.length - 1; i > 0; i -= 2) {
            arr[i] = i;
            System.out.print(arr[i] + " ");
        }
    }
}
