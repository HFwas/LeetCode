package _1_两数之和;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {//时间复杂度为O(n)
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap();
		
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		
		for (int i = 0; i < nums.length; i++) {
			int num = target - nums[i];
			if (map.containsKey(num)&&map.get(num) != i) {
				return new int[]{i,map.get(num)};
			}
		}
		return new int[]{-1,-1};
	}
}
