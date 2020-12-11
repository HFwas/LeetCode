package com.hfwas.demo;

/**
 * 输入：nums = [1,3,5,4,7]
 * 输出：3
 * 解释：最长连续递增序列是 [1,3,5], 长度为3。
 * 尽管 [1,3,5,7] 也是升序的子序列, 但它不是连续的，因为 5 和 7 在原数组里被 4 隔开。
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public int findLengthOfLCIS(int[] nums) {
        if (nums.length < 1) {
            return 0;
        }
        int maxLength = 1, tmp = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]){
                tmp++;
            }else {
                maxLength = Math.max(tmp,maxLength);
                tmp = 1;
            }
        }
        maxLength = Math.max(maxLength, tmp);
        return maxLength;
    }
}
