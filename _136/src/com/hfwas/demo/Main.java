package com.hfwas.demo;

/**
 *给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * 说明：
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 *
 * 示例 1:
 * 输入: [2,2,1]
 * 输出: 1
 * 输入: [4,1,2,1,2]
 * 输出: 4
 */
public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        int[] nums1 = {2,2,1};
        int[] nums2 = {4,1,2,1,2};
        int num1 = main.singleNumber(nums1);
        int num2 = main.singleNumber(nums2);
        System.out.println(num1);
        System.out.println(num2);
    }

    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }
}
