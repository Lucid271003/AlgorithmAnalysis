package BinarySearch;

public class Helper {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 6, 7, 9};
        var search = new BinarySearch();
        var index = search.binarySearchWithRecursion(number, 2);
        System.out.println(index);

    }
}
class BinarySearch {
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (array[middle] == target) {
                return middle;
            }
            if (target < array[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }
    public int binarySearchWithRecursion(int[] array, int target){
        return binarySearchWithRecursion(array, 2, 0, array.length - 1);
    }
    private int binarySearchWithRecursion(int[] array, int target, int left, int right){
        // base condition
        if(left > right){
            return -1;
        }
        // recursion calls
        int middle = (left + right) / 2;
        if(array[middle] == target){
            return middle;
        }
        if(target < array[middle]){
            return binarySearchWithRecursion(array, target, left, middle - 1);
        }else{
            return binarySearchWithRecursion(array, target, middle + 1, right);
        }
    }
}
