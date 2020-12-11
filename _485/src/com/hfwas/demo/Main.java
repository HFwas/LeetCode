package com.hfwas.demo;

/**
 * 输入: [1,1,0,1,1,1]
 * 输出: 3
 * 解释: 开头的两位和最后的三位都是连续1，所以最大连续1的个数是 3.
 */
public class Main {

    public static void main(String[] args) {

    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, tmp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0){
                tmp = 0;
            }else if (++tmp > max ){
                max = tmp;
            }
        }
        return max;
    }
}
