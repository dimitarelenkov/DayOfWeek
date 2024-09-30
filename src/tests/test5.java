package tests;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eggsCountForPlayerOne = Integer.parseInt(scanner.nextLine());
        int eggsCountForPlayerTwo = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();
        while (!command.equals("End")) {

            if (command.equals("one")) {
                eggsCountForPlayerTwo--;
            }
            else if (command.equals("two")) {
                eggsCountForPlayerOne--;
            }
            if (eggsCountForPlayerOne == 0){
                break;
            }
            else if (eggsCountForPlayerTwo == 0) {
                break;
            }

            command = scanner.nextLine();
        }
        if (eggsCountForPlayerOne == 0){
            System.out.printf("Player one is out of eggs." +
                    " Player two has %d eggs left.", eggsCountForPlayerTwo);
        }
        else if (eggsCountForPlayerTwo == 0) {
            System.out.printf("Player two is out of eggs." +
                    " Player one has %d eggs left.", eggsCountForPlayerOne);
        }
        else {
            System.out.printf("Player one has %d eggs left.%n", eggsCountForPlayerOne);
            System.out.printf("Player two has %d eggs left.", eggsCountForPlayerTwo);
        }
    }
}
