package src.main.java;

/**
 * 给定范围 [m, n]，其中 0 <= m <= n <= 2147483647，返回此范围内所有数字的按位与（包含 m, n 两端点）。
 * 示例 1: 
 * 输入: [5,7]
 * 输出: 4
 * 示例 2:
 *
 * 输入: [0,1]
 * 输出: 0
 */
public class Main {

    public static void main(String[] args) {
        // write your code here
        Main main = new Main();
        int i = main.rangeBitwiseAnd(5, 7);
        System.out.println(i);
    }

    public int rangeBitwiseAnd2(int m, int n) {
        //寻找公共前缀
        int num = 0;
        while (m != n) {
            m >>= 1;
            n >>= 1;
            num++;
        }
        return m << num;
    }

    public int rangeBitwiseAnd(int m, int n) {
        while (m < n) {
            n = n & (n - 1);
        }
        return n;
    }
}
