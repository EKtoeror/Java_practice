package Практика.Seminar_5;



public class Task_3 {
    public static void main(String[] args) {
        //int [] array =new int[]{1,2};
        //int [] array =new int[]{1,1,2};
        int [] array =new int[]{1,1,1,2,2};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i]==array[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
}
}
// public class task5_3 {

//     public static void main(String[] args) {

//     int[] arr = {1, 1, 1, 1, 1, 2, 2, 2};

//     Map<Integer, Integer> map = new HashMap<>();

//     for (int i = 0; i < arr.length; i++) {
//     if (map.containsKey(arr[i])) {
//     int j = map.get(arr[i]);
//     map.put(arr[i], j + 1);
//     }
//     else
//     map.put(arr[i], 1);
//     }

//     int sum = 0;
//     for (var item : map.entrySet()) {
//     int n = item.getValue();
//     sum += n*(n-1)/2;
//     }

//     System.out.
