package SortingAlgorithm.BubbleSort;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Helper {
    public static void main(String[] args) {
        int[] numbers = {7, 3, 1, 4, 6, 2, 3};
        long startTime = System.nanoTime();
        sortEnhanced(numbers);
        long endTime = System.nanoTime();
        System.out.println(Arrays.toString(numbers)); // 1, 2, 3, 3, 4, 6, 7
        System.out.println(endTime - startTime);
    }
    static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if(arr[j] < arr[j - 1]){
                    //swap two elements
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                }
            }
        }
    }
    static void sortEnhanced(int[] arr){
        for (int i = 0; i < arr.length; i++) {
//            boolean isSorted = true; // cach 1
            int count = 0;

            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j] < arr[j - 1]){
                    //swap two elements
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
//                  isSorted = false;
                    count++;
                }
            }
            if(count == 0){
                break;
            }
//            if(isSorted == true){
//                break;
//            }
        }
    }
}
