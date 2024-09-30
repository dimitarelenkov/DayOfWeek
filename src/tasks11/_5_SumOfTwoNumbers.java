package tasks11;

import java.util.Scanner;

public class _5_SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());
        boolean isThereMagicNumber = false;
        int count = 0;
        int fnum = 0;
        int snum = 0;


        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end ; j++) {

                count++;

                int sum =  i + j;
                if (sum == magicNum) {
                    isThereMagicNumber = true;
                    fnum = i;
                    snum = j;
                    break;
                }
            }
            if (isThereMagicNumber) {
                break;
            }
        }

        if (isThereMagicNumber) {
            System.out.printf("Combination N:%d (%d + %d = %d)",count, fnum, snum, magicNum);
        }
        else {
            System.out.printf("%d combinations - neither equals %d", count, magicNum);
        }


    }
}
