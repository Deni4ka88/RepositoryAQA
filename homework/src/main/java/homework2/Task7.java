package homework2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        if (x > 99 && x < 1000) {
            int result = x -= 1;
            System.out.println(result);
        }
    }
}
