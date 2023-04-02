package Практика.Seminar_2;

public class Task_4 {
    public static void main(String[] args) {
        String n = "Good morning my dear friend. My fish.".toLowerCase();
        int count = 0;
        char a = 'm';
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == a) {
                count++;
            }
        }
        System.out.println(count);
    }
}
