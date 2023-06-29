package com.hillel.task3;

import java.util.Random;
import java.util.Scanner;

public class MethodsForWord {
    public static String generateRandomWord(int length) {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder(length);
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        for (int i = 0; i < length; i++) {
            int letter = random.nextInt(alphabet.length());
            char randomLetter = alphabet.charAt(letter);
            stringBuilder.append(randomLetter);
        }
        return stringBuilder.toString();
    }
}
