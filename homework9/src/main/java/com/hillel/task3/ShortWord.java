package com.hillel.task3;

import java.util.Random;

public class ShortWord {
    public static void main(String[] args) {
        Random random = new Random();
        int wordCount = 10;
        int minWordLength = 2;
        int maxWordLength = 8;

        String wordsSeparete = "";

        for (int i = 0; i < wordCount; i++) {
            int wordLength = random.nextInt(maxWordLength - minWordLength + 1) + minWordLength;
            String randomWords = MethodsForWord.generateRandomWord(wordLength);
            wordsSeparete = (randomWords + " ");
            System.out.printf(randomWords + " ");
            String[] arr = wordsSeparete.split(" ");

            String wordsOnLetter = "";
// потрібно змінити на просто for
//            int maxCurrentLetter = 0;
//            for (int j = 0; j < arr.length; ++j) {
//                int currentLetterCount = 0;
//                for (int k = 0; k < arr.length; ++k) {
//                    if (arr[j] == arr[k]) {
//                        currentLetterCount++;
//                    }
//                }
//                if (currentLetterCount > maxCurrentLetter) {
//                    maxCurrentLetter = currentLetterCount;
//                }
//
//                System.out.println(maxCurrentLetter);
//            }
        }
        System.out.println();

        String[] arr = wordsSeparete.split(" ");

        String wordsOnLetter = "";

        for (String k : arr) {
            wordsOnLetter = k;
            System.out.println(k + " ");

            String[] arr1 = wordsOnLetter.split(" ");
            for (String l : arr1) {
                System.out.println(l + " ");
            }
        }


//        String str = "fffff ab f 1234 jkjk";
//        char[] arr1 = str.toCharArray();
////        String[] arr = str.split(" ");
//
//
//        int maxCurrentLetter = 0;
//        for (int i = 0; i < arr1.length; ++i) {
//            int currentLetterCount = 0;
//            for (int j = 0; j < arr1.length; ++j) {
//                if (arr1[i] == arr1[j]) {
//                    currentLetterCount++;
//                }
//            }
//            if (currentLetterCount > maxCurrentLetter) {
//                maxCurrentLetter = currentLetterCount;
//            }
//
//            System.out.println(maxCurrentLetter);
//        }

//        System.out.println(str.substring(0,str.length()));


//int compareTo(String anotherString) — порівнює два рядки лексикографічно;

    }
}
