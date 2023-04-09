package Практика.Seminar_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task_3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 9, 2, 6, 4, 3, 5, 7, 8, 0));
        System.out.println(sortByCollections(list));
        System.out.println(sortByComparator(list));
    }
    public static List<Integer> sortByCollections(List<Integer> list) {
        Collections.sort(list);
        //list.sort(null); по возрастанию
        return list;

    }
    public static List<Integer> sortByComparator(List<Integer>list) {
        list.sort(Collections.reverseOrder());//в обратном
        return list;
    }

}
