package _1_两数之和;
/**
 * https://leetcode-cn.com/problems/two-sum/
 * @author Administrator
 *	给定 nums = [2, 7, 11, 15], target = 9
因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]
 */
public class Solution {//时间复杂度为O(n2)
	public int[] twoSum(int[] nums, int target) {
		//int[] sum = new int[2];
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[]{i,j};
				}
			}
		}
		return new int[]{-1,-1};
    }
}
