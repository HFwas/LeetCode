package com.hfwas;

import sun.security.util.Length;

//接雨水
public class Main {

    public static void main(String[] args) {
	    // write your code here
    }

    public int trap(int[] height) {
        int res = 0;

        //遍历数组
        for (int i = 1; i < height.length - 1; i++) {
            int leftMax = 0,rightMax = 0;
            //计算左侧最值
            for (int j = 0; j <= i; j++) {
                leftMax = Math.max(leftMax, height[j]);
            }
            //计算右侧最值
            for (int j = i; j < height.length; j++) {
                rightMax = Math.max(height[j], rightMax);
            }
            res += Math.min(leftMax,rightMax) - height[i];
        }
        return res;
    }
}
