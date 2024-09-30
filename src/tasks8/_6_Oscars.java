package tasks8;

import java.util.Scanner;

public class _6_Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String actorsName = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; i++) {
            String name = scanner.nextLine();
            double points = Double.parseDouble(scanner.nextLine());

           academyPoints += (name.length() * points) / 2;
           if (academyPoints > 1250.50) {
               break;
           }
        }

        if (academyPoints > 1250.50) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorsName, academyPoints);

        }
        else {
            System.out.printf("Sorry, %s you need %.1f more!",actorsName, 1250.5 - academyPoints);

        }
    }
}
