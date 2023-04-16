package Практика.Seminar_5;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int n = Integer.parseInt(iScanner.nextLine());
        HashSet<String> uniqueWord = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String [] strArray = iScanner.nextLine().split("\\s+");
            uniqueWord.addAll(Arrays.asList(strArray));
        }


        System.out.println(uniqueWord.size());
        System.out.println(uniqueWord);
        iScanner.close();
}
}
