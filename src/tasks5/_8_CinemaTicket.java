package tasks5;

import java.util.Scanner;

public class _8_CinemaTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
        int num = 0;

        if ("Monday".equals(day)) {
            num += 12;
        } 
        else if ("Tuesday".equals(day)) {
            num += 12;
        }
        else if ("Wednesday".equals(day)) {
            num += 14;
        }
        else if ("Thursday".equals(day)) {
            num += 14;
        }
        else if ("Friday".equals(day)) {
            num += 12;
        }
        else if ("Saturday".equals(day)) {
            num += 16;
        }
        else if ("Sunday".equals(day)) {
            num += 16;
        }
        System.out.println(num);



    }
}
