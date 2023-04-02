package Практика.Seminar_1;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("m: ");
        int m = iScanner.nextInt();
        System.out.printf("n: ");
        int n = iScanner.nextInt();
        System.out.printf("k: ");
        int k = iScanner.nextInt();
        iScanner.close();
        if (k % m == 0 || k % n == 0) {
            System.out.println("Yes");
        } else
            System.out.println("No");

    }
}
