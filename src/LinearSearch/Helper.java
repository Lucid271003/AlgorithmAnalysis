package LinearSearch;

public class Helper {
    public static void main(String[] args) {
        int[] arr = {5, 7, 4, 14, 22, 8, 2};
        linearSearch(arr, 22);
    }
    static void linearSearch(int[] arr, int number){
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == number){
                found = true;
                System.out.println(i);
                break;
            }
        }
        if(!found){
            System.out.println("Element not found!");
        }
    }
}
