// Улитка ползёт по вертикальному шесту высотой h метров,0
// поднимаясь за день на a метров, а за ночь спускаясь на b метров.
// На какой день улитка доползёт до вершины шеста?
// Программа получает на вход натуральные числа h, a, b.
// Гарантируется, что a>b.
// Программа должна вывести одно натуральное число.

// Sample Input 1:

// 10
// 3
// 2

// Sample Output 1:

// 8

package Практика.Seminar_1;

import java.util.Scanner;

/**
 * Task_1
 */
public class Task_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("h: ");
        int h = iScanner.nextInt();
        System.out.printf("a: ");
        int a = iScanner.nextInt();
        System.out.printf("b: ");
        int b = iScanner.nextInt();
        iScanner.close();


        int day = 0;

        while (h -a > 0) {
            h = h - a + b;
            day++;
        }
        day++;
        System.out.printf("%d дней", day);
    }

}
