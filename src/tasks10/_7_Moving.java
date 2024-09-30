package tasks10;

import java.util.Scanner;

public class _7_Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wide = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int total = wide * length * height;
        boolean isFreeSpaceLeft = true;


        String command = scanner.nextLine();
        while (!command.equals("Done")) {
            int number = Integer.parseInt(command);

            total -= number;
            if (total <= 0) {
                isFreeSpaceLeft = false;
                break;
            }
            command = scanner.nextLine();
        }
        if (!isFreeSpaceLeft) {

            System.out.printf("No more free space! You need %d Cubic meters more.",Math.abs(total));

        }
        else {

            System.out.printf("%d Cubic meters left.",total);
        }
    }
}
