package tasks5;

import java.util.Scanner;

public class _3_AnimalType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String animals = scanner.nextLine();

        switch (animals) {
            case "dog":
                System.out.println("mammal");
                break;
            case "snake":
            case "crocodile":
            case "tortoise":
                System.out.println("reptile");
                break;
            default:
                System.out.println("unknown");
                break;

        }
    }
}
