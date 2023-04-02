package Практика.Seminar_1;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("n: ");
        int n = iScanner.nextInt();
        iScanner.close();

        int result = 1;
        while (n != 0) {
            result = result * n;
            n--;
        }
    System.out.println(result);
    }
}
