package Strings;

public class Fibonacci {

    // Iterative Approach Fast (Swapping)----------

    // public static int fib (int n){
    // if (n <= 1) {
    // return n;
    // }

    // int a = 0; // fib(0)
    // int b = 1; // fib(1)

    // for (int i = 2; i <= n; i++) {
    // int c = a + b; // next Fibonacci

    // a = b; // shift forward
    // b = c; // update
    // }

    // return b;



    // Recursive Approach--------------------

    public static int fib(int n) {

        if (n <= 1) {
            return n;

        }
        return fib(n - 1) + fib(n - 2);

    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(fib(n));
    }
}
