package 输入输出;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int m;
		int[][] nums;
		while (sc.hasNext()) {
			n = sc.nextInt();
			m = sc.nextInt();
			nums = new int[n][m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					nums[i][j] = sc.nextInt();
				}
			}
			
			for (int i = 0; i < nums.length; i++) {
				for (int j = 0; j < nums[0].length; j++) {
					System.out.print(nums[i][j]+" ");
				}
				System.out.println();
			}
		}
		
		
	}
}
