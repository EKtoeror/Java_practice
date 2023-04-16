package Практика.Seminar_5;
import java.util.HashSet;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        int number;
        HashSet<Integer> list = new HashSet<>();
        for (int i = 0; i < n; i++) {
            number = iScanner.nextInt();
            list.add(number);//записывает только уникальные,при выводе листа там будет 3 значения
        }
        System.out.println();
        System.out.println(list.size());
        iScanner.close();
    }
}
