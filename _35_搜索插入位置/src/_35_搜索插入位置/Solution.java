package _35_搜索插入位置;

public class Solution {
	public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
			int tmp = nums[i];
			if (nums[i] >= target) {
				return i;
			}
		}
		return nums.length;
    }
}
