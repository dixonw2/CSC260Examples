/**
 * shows examples of using a couple recursive methods and
 * how they can be used non-recursively
 * also depicts the speed hit recursive methods typically
 * take compared to non-recursive methods
 */

public class Recursion {
    public static void main(String[] args) {
        long runStart = System.nanoTime();
        int sum = summation(1000);
        long runEnd = System.nanoTime();
        System.out.println("Time spent on Summation recursion: " + (runEnd - runStart) + " nanoseconds\nAnswer: " + sum + "\n\n");
        runStart = System.nanoTime();
        sum = simpleSum(1000);
        runEnd = System.nanoTime();
        System.out.println("Time spent on Summation simple: " + (runEnd - runStart) + " nanoseconds\nAnswer: " + sum + "\n\n");

        runStart = System.nanoTime();
        int fib = fibonacci(20);
        runEnd = System.nanoTime();
        System.out.println("Time spent on Fibonacci recursion: " + (runEnd - runStart) + " nanoseconds\nAnswer: " + fib + "\n\n");
        runStart = System.nanoTime();
        fib = simpleFib(20);
        runEnd = System.nanoTime();
        System.out.println("Time spent on Fibonacci simple: " + (runEnd - runStart) + " nanoseconds\nAnswer: " + fib + "\n\n");

    }

    public static int summation(int n) {
        if (n == 0)
            return 0;
        return n + summation(n - 1);
    }

    public static int simpleSum(int n) {
        return (n * (n + 1)) / 2;
    }

    public static int fibonacci(int n) {
        if (n <= 2)
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int simpleFib(int n) {
        int nextTerm = 0, t1 = 0, t2 = 1;
        for (int i = 1; i < n; i++) {
            nextTerm = t1 + t2;
            t1 = t2;
            t2 = nextTerm;
        }
        return nextTerm;
    }

}
