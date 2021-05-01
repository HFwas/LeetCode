package com.hfwas.demo01;

import java.util.Arrays;

/**
 * 给定一个整型数组，在数组中找出由三个数组成的最大乘积，并输出这个乘积。
 *
 * 示例 1:
 * 输入: [1,2,3]
 * 输出: 6
 * 示例 2:
 * 输入: [1,2,3,4]
 * 输出: 24
 */
public class Main {

    public static void main(String[] args) {
        // write your code here
        //int[] nums = {1,2,3};
        //int[] nums = {1,2,3,4};
        //int[] nums = {-1,2,3,4};
        int[] nums = {-1,-2,3,4,5};
        int i = maximumProduct(nums);
        System.out.println(i);
    }

    public static int maximumProduct(int[] nums) {
        if (nums.length == 3) {
            return nums[0] * nums[1] * nums[2];
        }
        Arrays.sort(nums);
        int sum1 = nums[0] * nums[1] * nums[nums.length - 1];
        int sum2 = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];

        return Math.max(sum1,sum2);
    }
}
