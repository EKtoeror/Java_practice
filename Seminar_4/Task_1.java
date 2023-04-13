package Практика.Seminar_4;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        List<String> playList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String str = iScanner.next();
            if (str.equals("push")) {
                String str1 = iScanner.next();
                playList.add(str1);
            }
            else if (str.equals("pop")) {
                System.out.println("Play"+ " " + playList.get(0));//playList.remove(0);
                //playList.remove(0);
            }
        }
        iScanner.close();
        System.out.println(playList);

    }
}
