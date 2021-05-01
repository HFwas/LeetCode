package _493_翻转对;

public class Solution {
	public int reversePairs(int[] nums) {
		int i = 0;
		int j = nums.length - 1;
		int count = 0;
		while (i < j) {
			if (nums[i] > 2*nums[j]) {
				count++;
			}else {
				i++;
			}
		}
		return count;
    }
}
