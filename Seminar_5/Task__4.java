package Практика.Seminar_5;
import java.util.*;

public class Task__4 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>(Map.of(
            "Москва", "Самара",
            "Самара", "Курск",
            "Курск", "Пенза"
            //"Пенза", "Мурманск"
));
for (String el : map.values()) {//по массиву значений
    System.out.println(map.containsKey(el) ? "" : el);//проверка наличия значений в ключах
//если true - пустая строка,если false - элемент
}
    }
}
