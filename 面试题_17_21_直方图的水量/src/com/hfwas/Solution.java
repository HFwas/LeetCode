package com.hfwas;

/**
 * @Auther: HFwas
 * @Date: 2020/12/5
 * @Description: 第一种方法：暴力解法
 * @version: 1.0
 */
public class Solution {
    public int trap(int[] height) {
        int res = 0 ;

        for (int i = 0; i < height.length - 1; i++) {
            int leftMax = 0,rightMax = 0;
            for (int j = 0; j <= i; j++) {
                leftMax = Math.max(leftMax, height[j]);
            }
            //右侧最大值
            for (int j = i; j < height.length; j++) {
                rightMax = Math.max(height[j], rightMax);
            }
            res += Math.min(leftMax,rightMax) - height[i];
        }
        return res;
    }

}
