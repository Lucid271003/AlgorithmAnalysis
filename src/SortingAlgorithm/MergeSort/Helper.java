package SortingAlgorithm.MergeSort;

import java.util.Arrays;
class MergeSort{
    public void sort(int[] array){
        // base condition
        if(array.length < 2){
            return;
        }

        // divide the array into half
        var middle = array.length / 2;

        int[] left = new int[middle];
        for(int i = 0; i < middle; i++){
            left[i] = array[i];
        }

        int[] right = new int[array.length - middle];
        for(int i = middle; i < array.length; i++){
            right[i - middle] = array[i];
        }

        // sort each half
        sort(left);
        sort(right);

        // merge the result
        merge(left, right, array);
    }
    private static void merge(int[] left, int[] right, int[] result){
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length){
            if(left[i] <= right[j]){
                result[k] = left[i];
                i++;
            } else{
                result[k] = right[j];
                j++;
            }
            k++;
        }
        // copy remaining source array to result
        while (i < left.length){
            result[k] = left[i];
            k++;
            i++;
        }

        while (j < right.length){
            result[k] = right[j];
            k++;
            j++;
        }
    }
}

public class Helper {
    public static void main(String[] args) {
//        int[] array = {1, 5, 3, 6, 2, 7, 8, 4};
//        int[] array = {1, 5, 3, 6, 2, 7, 8, 4, 3};
        int[] array = {1, 5, 3, 6, 2, 7, 8, 4, 9};
        var sorter = new MergeSort();
        sorter.sort(array);
        System.out.println(Arrays.toString(array));
    }

}
