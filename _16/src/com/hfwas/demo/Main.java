package com.hfwas.demo;

import java.util.Arrays;

/**
 * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，
 * 使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。
 *
 * 示例：
 *
 * 输入：nums = [-1,2,1,-4], target = 1
 * 输出：2
 * 解释：与 target 最接近的和是 2 (-1 + 2 + 1 = 2) 。
 */
public class Main {

    public static void main(String[] args) {
	// write your code here

    }

    public int threeSumClosest(int[] nums, int target) {
        int length = nums.length;
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length; i++) {
            int begin = i + 1;
            int end = length - 1;
            while (begin < end) {
                int sum = nums[begin] + nums[i] + nums[end];
                if (Math.abs(sum - target) < Math.abs(ans - target)) {
                    ans = sum;
                }

                if(sum < target){
                    begin++;
                }else if (sum > target) {
                    end--;
                }else {
                    return sum;
                }
            }
        }
        return ans;
    }
}
