package Практика.Seminar_3;

import java.util.ArrayList;
import java.util.List;

public class Task_0 {
    public static void main(String[] args) {
        List<String> list_strings = new  ArrayList<>();
        list_strings.add("red");
        list_strings.add("blue");
        list_strings.add("green");
        list_strings.add("white");
        list_strings.add("black");
        System.out.println(list_strings);//all

        System.out.println(list_strings.get(0));//по индексу
        for (String item : list_strings) { //foreach
            System.out.println(item);
        }
        list_strings.set(4, "yellow");//замена элемента по индексу

        list_strings.remove(2);//удаление элемента по индексу

        System.out.println(list_strings.indexOf("red")); //поиск ндекса элемента
    }
}
