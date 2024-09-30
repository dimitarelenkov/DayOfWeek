package tasks11;

import java.util.Scanner;

public class _1_Clock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i <= 23 ; i++) {
            for (int m = 0; m <= 59 ; m++) {

                System.out.printf("%d:%d%n", i, m);
            }

        }
    }
}
