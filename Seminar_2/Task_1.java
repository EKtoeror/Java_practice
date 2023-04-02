package Практика.Seminar_2;

import java.util.Scanner;


/**
 * Task_1
 */
public class Task_1 {

    public static void main(String[] args) {
        String numbers = "4 5 3 5 2 6 4 6 6 8 1 2 3 8 4 0 9 7";
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("n: ");
        String n = iScanner.next();
        int x1 = numbers.indexOf(n);
        int x2 = numbers.lastIndexOf(n);
        System.out.println(x1);
        System.out.println(x2);
        iScanner.close();
    }
}
