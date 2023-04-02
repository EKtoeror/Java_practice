package Практика.Seminar_1;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("x: ");
        double x = iScanner.nextInt();
        System.out.printf("y: ");
        int y = iScanner.nextInt();
        iScanner.close();

        int day = 1;
        while (y - x > 0) {
            x = x + (x * 0.1);
            day+=1;
        }
        System.out.println(day);

    }
}
