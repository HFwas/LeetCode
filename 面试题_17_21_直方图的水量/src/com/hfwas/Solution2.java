package com.hfwas;

/**
 * @Auther: HFwas
 * @Date: 2020/12/5
 * @Description: 第三种方法：使用双指针
 * @version: 1.0
 */
public class Solution2 {

    public int trap(int[] height) {
        int res = 0, leftMax = 0, rightMax = 0, left = 0, right = height.length - 1;
        while (left <= right) {
            if (leftMax <= rightMax) {
                leftMax = Math.max(leftMax, height[left]);
                res += leftMax - height[left++];
            } else {
                rightMax = Math.max(rightMax, height[right]);
                res += rightMax - height[right--];
            }
        }
        return res;
    }

}
