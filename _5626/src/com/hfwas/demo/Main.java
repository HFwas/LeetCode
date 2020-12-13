package com.hfwas.demo;

/**
 * 如果一个十进制数字不含任何前导零，且每一位上的数字不是 0 就是 1 ，那么该数字就是一个 十-二进制数 。
 * 例如，101 和 1100 都是 十-二进制数，而 112 和 3001 不是。
 * 给你一个表示十进制整数的字符串 n ，返回和为 n 的 十-二进制数 的最少数目。
 * 输入：n = "32"
 * 输出：3
 * 解释：10 + 11 + 11 = 32
 *
 * 输入：n = "82734"
 * 输出：8
 */
public class Main {

    public static void main(String[] args) {
        String str = "32";
        String str2 = "27346209830709182346";
        String str3 = "82734";
        Main ma = new Main();
        int a = ma.minPartitions(str);
        int b = ma.minPartitions(str2);
        int c = ma.minPartitions(str3);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public int minPartitions(String n) {
        char max = '0';
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) > max) {
                max = n.charAt(i);
            }
        }
        return max - '0';
    }
}
