package SortingAlgorithm.InsertionSort;

import java.awt.*;
import java.util.Arrays;

public class Helper {
    public static void main(String[] args) {
        int a[] = {3, 7, 5, 2, 3, 1, 5, 8};
        insertionSort(a);
        System.out.println(Arrays.toString(a));
    }
    static void insertionSort(int a[]){
        for(var i = 1; i < a.length; i++){
            var temp = a[i];
            //find its correct place on the left
            var j = i - 1;
            while(j >= 0 && a[j] > temp){
                //shift element to the right
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = temp;
        }
    }
}
