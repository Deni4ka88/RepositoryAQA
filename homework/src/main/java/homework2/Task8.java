package homework2;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        if (x > 0 && x < 100) {
            int tens = (x / 10) % 10;
            int ones = x % 10;
            int sumOfDigits = tens + ones;
            if(sumOfDigits > x){
                System.out.println(sumOfDigits);
            } else if (sumOfDigits<x){
                System.out.println(x);
            }
        }
    }
}
