package homework2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        if (x > 0) {
            System.out.println("Positive numbers");
        }
        if (x < 0) {
            System.out.println("Negative numbers");
        }
        if (x == 0) {
            System.out.println("Zero");
        }
    }
}
