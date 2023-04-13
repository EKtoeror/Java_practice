package Практика.Seminar_4;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Task_2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        List<String> chair = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String str = iScanner.next();
            if (str.equals("push")) {
                String str1 = iScanner.next();
                chair.add(str1);
            }
            else if (str.equals("pop")) {
                System.out.println("Petya took"+ " " +chair.remove(chair.size()-1));
                //playList.remove(0);
            }
        }
        iScanner.close();
        System.out.println(chair);





        iScanner.close();
    }
}
