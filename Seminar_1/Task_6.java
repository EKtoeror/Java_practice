package Практика.Seminar_1;
import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("size: ");
        int size = iScanner.nextInt();

        int [] arr = new int[size];
        int sum =0;
        // System.out.println("элемент: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("элемент: ");
            arr[i] = iScanner.nextInt();
            if (i%2==0) {
                sum = sum + arr[i];
            }
        }
        iScanner.close();
        System.out.printf("Cумма = %d",sum);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (i%2==0) {
                System.out.println(arr[i]);
            }
        }
        }

    }
