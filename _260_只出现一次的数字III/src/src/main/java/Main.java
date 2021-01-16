package src.main.java;

/**
 * 给定一个整数数组 nums，其中恰好有两个元素只出现一次，其余所有元素均出现两次。 找出只出现一次的那两个元素。
 * 示例 :
 * 输入: [1,2,1,3,2,5]
 * 输出: [3,5]
 * 注意：
 * 结果输出的顺序并不重要，对于上面的例子， [5, 3] 也是正确答案。
 * 你的算法应该具有线性时间复杂度。你能否仅使用常数空间复杂度来实现？
 * @src:https://leetcode-cn.com/problems/single-number-iii/
 */
public class Main {

    public static void main(String[] args) {
	    // write your code here
        int[] arr = {1,2,1,3,2,5};
        Main main = new Main();
        int[] ints = main.singleNumber(arr);
        for (int i : ints) {
            System.out.print(i + " ");
        }
    }

    public int[] singleNumber(int[] nums) {
        int[] arr = new int[2];
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        int bit = res & (-res);
        for (int num : nums) {
            if ((num & bit) == 0){
                arr[0] ^= num;
            }else {
                arr[1] ^= num;
            }
        }
        return arr;
    }
}
