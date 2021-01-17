package src.main.java;

/**
 * 给定一个非负整数 num。对于 0 ≤ i ≤ num 范围中的每个数字 i ，计算其二进制数中的 1 的数目并将它们作为数组返回。
 * 示例 1:
 * 输入: 2
 * 输出: [0,1,1]
 * 示例 2:
 * 输入: 5
 * 输出: [0,1,1,2,1,2]
 * @src:https://leetcode-cn.com/problems/counting-bits/
 */
public class Main {

    public static void main(String[] args) {
	    // write your code here
        Main main = new Main();
        int[] ints = main.countBits(5);
        for (int anInt : ints) {
            System.out.print(anInt + " ");
        }
    }

    public int[] countBits(int num) {
        int[] nums = new int[num + 1];
        for (int i = 1; i <= num; i++) {
            nums[i] = nums[i & (i - 1)] + 1;
        }
        return nums;
    }
}
