package Практика.Seminar_3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        List<String> listInt = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            listInt.add(String.valueOf(i));
        }
        System.out.println(listInt);


        int m = iScanner.nextInt();
        String s = iScanner.next();
        //listInt.set(m - 1, s);
        listInt.add(m, s);

        System.out.println(listInt);
        iScanner.close();
    }
}
