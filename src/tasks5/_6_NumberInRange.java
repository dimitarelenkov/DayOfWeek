package tasks5;

import java.util.Scanner;

public class _6_NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        if (-100 <= n && n <= 100 && n != 0) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
