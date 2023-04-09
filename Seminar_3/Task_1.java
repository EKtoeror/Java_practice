package Практика.Seminar_3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        List<Integer> listInt = new ArrayList<>();
        listInt.add(1);
        for (int i = 0; i < n; i++) {
            listInt.add(0);
        }
        listInt.add(1);
        iScanner.close();
    }
}
