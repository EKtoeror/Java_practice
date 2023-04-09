package Практика.Seminar_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task_4 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("a", "2", "b", "3", "c", "4"));
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).matches("[0-9]")) {
                System.out.printf("%s - %s", list.get(i), "число");
                System.out.println();
            }
            else{
                System.out.printf("%s - %s", list.get(i), "буква");
                System.out.println();
            }
        }

    }
    }
// через итератор
    // Iterator<String> iterator = list.iterator();
    // while (iterator.hasNext()){
    //     String element = iterator.next();
    //     try {
    //         Integer.parseInt(element);
    //         System.out.println(element + "int");
    //     } catch (NumberFormatException e) {
    //         System.out.println(element + "string");
    //     }
    // }
// через цикл
// for (String element : list){
//     try {
//                 Integer.parseInt(element);
//                 System.out.println(element + "int");
//             } catch (NumberFormatException e) {
//                 System.out.println(element + "string");
//             }
//         }
// }
