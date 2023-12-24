import java.util.ArrayList;
import java.util.List;

public class ComplexityExercise {
    //O(n.log n)
    static void exercise1( int n ) {
        int sum = 0;
        for ( int i = 0; i < n; i++ ) {
            for ( int j = 1; j < n; j = j * 2 ) {
                sum++;
            }
        }
        System.out.println(sum);

    }
    //O(n^2)
    static void exercise2( int n ) {
        int sum = 0;
        for ( int i = 1; i < n * n; i++ ) {
            sum = sum + 1;
        }
    }
    //O(log n)
    static void exercise3( int n ) {
        int i = n;
        int sum = 0;
        while ( i > 0 ) {
            sum = sum + i;
            i = i / 2;
        }
    }
    //O(n^2)
    static void exercise4( int n ) {
        int sum = 0;
        for ( int i = 0; i < n; i++ ) {
            for ( int j = 0; j < n; j++ ) {
                sum++;
            }
        }
    }
    //O(n^2)
    static void exercise5( int n ) {
        int sum = 0;
        for ( int i = 0; i < n; i++ ) {
            for ( int j = 1; j < i; j++ ) {
                sum++;
            }
        }
    }

    //O(n^2)
    static void exercise6(int n) {
        int product = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                product *= 2;
            }
        }
    }

    // O(2^n)
    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // O(n!)
    static List<List<Integer>> generatePermutations(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generate(nums.length, nums, result);
        return result;
    }

    static void generate(int n, int[] nums, List<List<Integer>> result) {
        if (n == 1) {
            List<Integer> permutation = new ArrayList<>();
            for (int num : nums) {
                permutation.add(num);
            }
            result.add(permutation);
        } else {
            for (int i = 0; i < n - 1; i++) {
                generate(n - 1, nums, result);
                if (n % 2 == 0) {
                    swap(nums, i, n - 1);
                } else {
                    swap(nums, 0, n - 1);
                }
            }
            generate(n - 1, nums, result);
        }
    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
