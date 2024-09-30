package tasks8;

import java.util.Scanner;

public class _5_Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int price = Integer.parseInt(scanner.nextLine());

        int Facebook = 150;
        int Instagram = 100;
        int Reddit = 50;

        for (int i = 1; i <= n ; i++) {

            String websiteName = scanner.nextLine();

            if (websiteName.equals("Facebook")) {

                price -= Facebook;
            }
            else if (websiteName.equals("Instagram")) {
                price -= Instagram;
            }
            else if (websiteName.equals("Reddit")) {
                price -= Reddit;
            }
        }
        if (price <= 0) {
            System.out.println("You have lost your salary.");
        }
        else {
            System.out.println(price);
        }
    }
}
