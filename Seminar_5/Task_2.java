package Практика.Seminar_5;
import java.util.HashSet;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        int number;
        String str = "";
        HashSet<Integer> list = new HashSet<>();
        for (int i = 0; i < n; i++) {
            number = iScanner.nextInt();
            //list.add(number);//записывает только уникальные,при выводе листа там будет 3 значения
            if (list.add(number)==false) { //если элемент при записи не уникальный false
            // if (list.contains(number)) //проверка на наличие
                str = str + "yes" + " ";
                //System.out.println("yes");
            }
            else {
                str = str + "no"+ " ";
                //System.out.println("no");
            }
            list.add(number);
        }
        System.out.println();
        System.out.println(list.size());
        iScanner.close();
        System.out.println(str);
    }
}
