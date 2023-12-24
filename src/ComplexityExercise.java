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
    //O(n^2\)
    static void exercise6( int n ) {
        int product = 1;
        for ( int i = 1; i <= n; i++ ) {
            for ( int j = 1; j <= i; j++ ) {
                product *= 2;
            }
        }
    }

    public static void main(String[] args) {
        ComplexityExercise complexityExercise = new ComplexityExercise();
        complexityExercise.exercise1(5);
    }
}
