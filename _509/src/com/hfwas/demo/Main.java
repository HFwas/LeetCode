package com.hfwas.demo;

/**
 * 斐波那契数，通常用 F(n) 表示，形成的序列称为斐波那契数列。该数列由 0 和 1 开始，
 * 后面的每一项数字都是前面两项数字的和。也就是：
 * F(0) = 0,   F(1) = 1
 * F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
 * 给定 N，计算 F(N)。
 */
public class Main {

    public static void main(String[] args) {
        Main ex = new Main();
        int num1 = ex.fib(100);
        System.out.println(num1);
        int num2 = ex.fib1(100);
        System.out.println(num2);
    }

    public int fib1(int N) {//9ms,35.5MB
        if (N == 0 || N == 1) {
            return N;
        }
        return fib(N - 1) + fib(N - 2);
    }

    public int fib(int N) {//0ms,35.5MB
        if (N == 0 || N == 1) {
            return N;
        }
        int a = 0;
        int b = 1;
        for (int i = 2; i <= N; i++) {
            b = a + b;
            a = b - a;
        }
        return b;
    }
}
