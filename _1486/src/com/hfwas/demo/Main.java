package com.hfwas.demo;

/**
 *给你两个整数，n 和 start 。
 * 数组 nums 定义为：nums[i] = start + 2*i（下标从 0 开始）且 n == nums.length 。
 * 请返回 nums 中所有元素按位异或（XOR）后得到的结果。
 * 示例 1：
 * 输入：n = 5, start = 0
 * 输出：8
 * 解释：数组 nums 为 [0, 2, 4, 6, 8]，其中 (0 ^ 2 ^ 4 ^ 6 ^ 8) = 8 。
 *      "^" 为按位异或 XOR 运算符。
 */
public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        int i1 = main.xorOperation(5, 0);
        int i2 = main.xorOperation(4, 3);
        int i3 = main.xorOperation(1, 7);
        //8
        System.out.println(i1);
        //8
        System.out.println(i2);
        //7
        System.out.println(i3);

        System.out.println(7 << 1);
        System.out.println(0 << 1);
        System.out.println(1 << 1);
    }

    public int xorOperation(int n, int start) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            res ^= (start + i * 2);
        }
        return res;
    }
}
