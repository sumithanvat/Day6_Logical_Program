package com.bridgelabz;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10; // number of terms in the series
        int t1 = 0, t2 = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; ++i) {
            System.out.print(t1 + " + ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }

    }
}
