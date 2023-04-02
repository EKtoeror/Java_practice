package Практика.Seminar_2;
import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        String n = "34Hi56";
        Scanner scan = new Scanner(n);
        scan.useDelimiter("\\D+");
        //int numbers = scan.nextInt();
        int digCount = 0;
        int charsCount = 0;
        scan.close();
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) >= '0' && n.charAt(i) <='9') {
                digCount++;
            }
            else if (n.charAt(i) >= 'a' && n.charAt(i) <='z') {
                charsCount++;
            }

            }
        if (digCount>charsCount) {
            System.out.println("digit");
        } else {System.out.println("chars");

        }
        }
    }
