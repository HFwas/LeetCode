package src.main.java;

/**
 * 编写一个程序判断给定的数是否为丑数。
 *
 * 丑数就是只包含质因数 2, 3, 5 的正整数。
 *
 * 示例 1:
 *
 * 输入: 6
 * 输出: true
 * 解释: 6 = 2 × 3
 * 示例 2:
 *
 * 输入: 8
 * 输出: true
 * 解释: 8 = 2 × 2 × 2
 */
public class Main {

    public static void main(String[] args) {
	    // write your code here
    }

    public boolean isUgly(int num) {
        if(num==0) return false;
        while(true){
            if(num%2==0)num/=2;
            else if(num%3==0)num/=3;
            else if(num%5==0)num/=5;
            else if(num==1)return true;
            else return false;

        }
    }
}
