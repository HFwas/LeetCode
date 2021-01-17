package src.main.java;

/**
 * 给定一个整数，写一个函数来判断它是否是 4 的幂次方。如果是，返回 true ；否则，返回 false 。
 * 整数 n 是 4 的幂次方需满足：存在整数 x 使得 n == 4x
 * 示例 1：
 * 输入：n = 16
 * 输出：true
 * 示例 2：
 * 输入：n = 5
 * 输出：false
 * @src:https://leetcode-cn.com/problems/power-of-four/
 */
public class Main {

    public static void main(String[] args) {
	    // write your code here
        //System.out.println(7 % 4);
        Main main = new Main();
        boolean powerOfFour = main.isPowerOfFour(5);
        boolean powerOfFour1 = main.isPowerOfFour(16);
        System.out.println(powerOfFour);
        System.out.println(powerOfFour1);
    }

    public boolean isPowerOfFour(int n) {
        if (n < 0) {
            return false;
        }
        int num = n & (-n);
        if (n - num != 0) {
            return false;
        }
        return n % 3 == 1;
    }

    public boolean isPowerOfFour1(int n) {
        if (n == 0) {
            return false;
        }
        while (n % 4 == 0) {
            n = n / 4;
        }
        return n == 1;
    }
}
