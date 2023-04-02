package Практика.Seminar_1;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("a: ");
        int a = iScanner.nextInt();
        System.out.printf("b: ");
        int b = iScanner.nextInt();
        System.out.printf("c: ");
        int c = iScanner.nextInt();
        iScanner.close();

       System.out.println(a);
        while (a - c >= b) {
            a = a - c;
            System.out.println(a);
        }
    }
}
