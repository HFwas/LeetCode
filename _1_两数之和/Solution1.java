package _1_两数之和;

import java.util.HashMap;
import java.util.Map;

/**
 * 如果数组当中存在两数相加等于给定目标值的数字，目标值减去已经知道的一个数值，
 * 则另一个数字一定在集合中，使用map.containsKey一定可以找到
 */
public class Solution1 {//时间复杂度为O(n)
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap();

		// 将数组中值作为key,索引作为value存储到Map集合中去
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		
		for (int i = 0; i < nums.length; i++) {
			// 得到另一个数字，再去集合中去找，如果存在，取出值存入数组中
			// 如果没有，则下一个
			int num = target - nums[i];
			// 排除自身 map.get(num) != i
			if (map.containsKey(num)&&map.get(num) != i) {
				return new int[]{i,map.get(num)};
			}
		}
		return new int[]{-1,-1};
	}
}
