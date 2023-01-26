package ru.osmanov;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibEffective(10));
    }

    // очевидный способ, медленный
    private static long fibNaive(int a) {
        if (a <= 1)
            return a;
        return fibNaive(a - 1) + fibNaive(a - 2);
    }

    private static long fibEffective(int a) {
        long[] arr = new long[a + 1];

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= a; i++)
            arr[i] = arr[i - 1] + arr[i - 2];
        return arr[a];
    }
}