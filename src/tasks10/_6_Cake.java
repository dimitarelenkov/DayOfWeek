package tasks10;

import java.util.Scanner;

public class _6_Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());

        int counter = length * width;
        String num = scanner.nextLine();



        while (!num.equals("STOP")) {
            int number = Integer.parseInt(num);

                counter -= number;

                if (counter <= 0) {
                    break;
                }

                num = scanner.nextLine();
        }
        if (counter <= 0) {
            System.out.printf("No more cake left! You need %d pieces more.",Math.abs(counter));
        }
        else {
            System.out.printf("%d pieces are left.",counter);
        }
    }
}
