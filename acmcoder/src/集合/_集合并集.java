package 集合;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 * https://exercise.acmcoder.com/online/online_judge_ques?ques_id=3374&konwledgeId=41
 * @author Administrator
 */
public class _集合并集 {
	public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	while(in.hasNext()){
    		int n = in.nextInt();
    		int m = in.nextInt();
    		HashSet<Integer> hashset = new HashSet<Integer>();
    		for(int i = 0; i < n; i++){
    			hashset.add(in.nextInt());
    		}
    		for(int i = 0; i < m; i++){
    			hashset.add(in.nextInt());
    		}
    		Object[] arr = hashset.toArray();
    		int[] array = new int[arr.length];
    		for(int i = 0; i < array.length; i++){
    			array[i] = (int) arr[i];
    		}
    		Arrays.sort(array);
    		for(int i = 0; i < array.length; i++){
    			System.out.print(array[i]+" ");
    		}
    	}
    	
    	
    }
}
