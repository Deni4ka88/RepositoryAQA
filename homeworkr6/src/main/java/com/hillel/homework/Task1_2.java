package com.hillel.homework;

public class Task1_2 {
    public static void main(String[] args) {
        int[] arr = new int[21];
        for (int i = 2; i < 21; i += 2) {
            arr[i] = i;
            System.out.println(arr[i]);
        }
    }
}

