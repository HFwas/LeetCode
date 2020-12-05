package com.hfwas;

/**
 * @Auther: HFwas
 * @Date: 2020/12/5
 * @Description: 第四种方法：动态规划
 * @version: 1.0
 */
public class Solution3 {

    public int trap(int[] height) {
        int n = height.length;
        if (n == 0) {
            return 0;
        }
        // 定义二维dp数组
        // dp[i][0] 表示下标i的柱子左边的最大值
        // dp[i][1] 表示下标i的柱子右边的最大值
        int[][] dp = new int[n][2];
        dp[0][0] = height[0];
        dp[n - 1][1] = height[n - 1];
        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.max(height[i], dp[i - 1][0]);
        }
        for (int i = n - 2; i >= 0; i--) {
            dp[i][1] = Math.max(height[i], dp[i + 1][1]);
        }
        // 遍历每个柱子，累加当前柱子顶部可以储水的高度，
        // 即 当前柱子左右两边最大高度的较小者 - 当前柱子的高度。
        int res = 0;
        for (int i = 1; i < n - 1; i++) {
            res += Math.min(dp[i][0], dp[i][1]) - height[i];
        }
        return res;
    }

}
