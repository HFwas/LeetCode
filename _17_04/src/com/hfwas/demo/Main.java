package com.hfwas.demo;

/**
 * 数组nums包含从0到n的所有整数，但其中缺了一个。请编写代码找出那个缺失的整数。你有办法在O(n)时间内完成吗？
 * 注意：本题相对书上原题稍作改动
 *
 * 示例 1：
 * 输入：[3,0,1]
 * 输出：2
 */
public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        int[] nums = {3,0,1};
        int i = main.missingNumber(nums);
        System.out.println(i);
    }

    public int missingNumber(int[] nums) {
        int res = nums.length;
        for (int i = 0; i < nums.length; i++) {
            res ^= nums[i];
            res ^= i;
        }
        return res;
    }
}
