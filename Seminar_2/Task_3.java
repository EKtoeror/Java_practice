package Практика.Seminar_2;
import java.util.Scanner;


public class Task_3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите ip адрес: ");
        String ipAdress = iScanner.next();
        String[] ip = ipAdress.split("[.]");
        int count = 0;
        iScanner.close();
        if (ip.length == 4) {
            for (int i = 0; i < ip.length; i++) {
                Scanner scan = new Scanner(ip[i]);
                scan.useDelimiter("\\D+");
                int scanInt = scan.nextInt();
                if (scanInt >= 0 && scanInt < 256) {
                    count ++;
                }
            }
            if (count == 4) {
                System.out.println("yes");
            }
            else {System.out.println("no");}
            }
        else{System.out.println("no");}

        }

    }
