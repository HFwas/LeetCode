package com.hfwas.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList();
        int length = nums.length;
        if(nums == null || length < 3) return list;
        Arrays.sort(nums);

        for (int i = 0; i < length; i++) {
            if(nums[i] > 0) break;
            if(i > 0 && nums[i] == nums[i - 1]) continue;//去重
            int start = i + 1;
            int end = length - 1;

            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];
                if (sum == 0) {
                    list.add(Arrays.asList(nums[i],nums[start],nums[end]));
                    while(start < end && nums[start] == nums[start + 1]) start++;//去重
                    while(start < end && nums[end] == nums[end - 1]) end--;//去重
                    start++;
                    end--;
                }else if (sum < 0) {
                    start++;
                }else if (sum > 0) {
                    end--;
                }
            }
        }
        return list;
    }
}
