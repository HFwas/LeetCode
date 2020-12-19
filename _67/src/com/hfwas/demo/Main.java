package com.hfwas.demo;

/**
 *给你两个二进制字符串，返回它们的和（用二进制表示）。
 * 输入为 非空 字符串且只包含数字 1 和 0。
 * 示例 1:
 *
 * 输入: a = "11", b = "1"
 * 输出: "100"
 */
public class Main {

    public static void main(String[] args) {
	// write your code here

    }

    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;

        // 保存结果的可变的字符序列对象
        StringBuilder res = new StringBuilder();
        // 当前和
        int curSum;
        // 进位
        int carry = 0;
        while (i >= 0 || j >= 0) {
            // 当前和至少是那个进位
            curSum = carry;
            if (i >= 0) {
                curSum += a.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                curSum += b.charAt(j) - '0';
                j--;
            }

            // 判断是否需要进位，即确定 carry 的值
            if (curSum > 1) {
                curSum -= 2;
                carry = 1;
            } else {
                carry = 0;
            }

            // 只写结果的值，进位作为下一轮的初始值
            res.insert(0, curSum);
        }

        // 这里不要忘记如果全部加完以后还要进位，要把最高位加上 1
        if (carry == 1) {
            res.insert(0, 1);
        }
        return res.toString();
    }

}
