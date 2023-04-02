package Практика.Seminar_2;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Любимая буква маши: ");
        String x1 = iScanner.nextLine();
        System.out.printf("Любимая буква Олега: ");
        String x2 = iScanner.nextLine();
        System.out.printf("Строка из газеты: ");
        String x3 = iScanner.nextLine();
        iScanner.close();

        int count1 = 0;
        int count2 = 0;

        String [] array = x3.split(" ");
        for (int i = 0; i < array.length; i++) {
            if (array[i].indexOf(x1) != -1) {
                count1 ++;
            }
            if (array[i].indexOf(x2) != -1) {
                count2 ++;
            }
            }

        System.out.println(count1);
        System.out.println(count2);
        }

    }
