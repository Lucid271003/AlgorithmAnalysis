package SortingAlgorithm.SelectionSort;

import java.util.Arrays;

public class Helper {
    public static void main(String[] args) {
        int[] numbers = {7, 3, 1, 4, 6, 2, 3};
        sort(numbers);
        System.out.println(Arrays.toString(numbers)); // 1, 2, 3, 3, 4, 6, 7
    }
    static void sort(int[] array){
        for(int i = 0; i < array.length; i++){
            int minIndex = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[j] < array[minIndex]){
                    minIndex = j;
                }
            }

            // swap two elements
            int tmp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = tmp;
        }
    }
}
