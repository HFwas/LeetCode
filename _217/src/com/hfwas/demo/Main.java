package com.hfwas.demo;

import java.util.HashSet;
import java.util.Hashtable;

/**
 * 给定一个整数数组，判断是否存在重复元素。
 * 如果任意一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
 * 示例 1:
 * 输入: [1,2,3,1]
 * 输出: true
 */
public class Main {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        Main ma = new Main();
        boolean b = ma.containsDuplicate(nums);
        System.out.println(b);
    }

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            //
            if (hashSet.contains(nums[i])) {
                return true;
            }
            hashSet.add(nums[i]);
        }
        return false;
    }
}
