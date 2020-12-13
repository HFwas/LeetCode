package com.hfwas.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 输入：candies = [2,3,5,1,3], extraCandies = 3
 * 输出：[true,true,true,false,true]
 * 解释：
 * 孩子 1 有 2 个糖果，如果他得到所有额外的糖果（3个），那么他总共有 5 个糖果，他将成为拥有最多糖果的孩子。
 * 孩子 2 有 3 个糖果，如果他得到至少 2 个额外糖果，那么他将成为拥有最多糖果的孩子。
 * 孩子 3 有 5 个糖果，他已经是拥有最多糖果的孩子。
 * 孩子 4 有 1 个糖果，即使他得到所有额外的糖果，他也只有 4 个糖果，无法成为拥有糖果最多的孩子。
 * 孩子 5 有 3 个糖果，如果他得到至少 2 个额外糖果，那么他将成为拥有最多糖果的孩子。
 */
public class Main {

    public static void main(String[] args) {
        int[] can = new int[]{2,3,5,1,3};
        int extra = 3;
        Main ma = new Main();
        List<Boolean> list = ma.kidsWithCandies(can, extra);
        for (Boolean b:
             list) {
            System.out.print(b + " ");
        }
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if (max < candies[i]) {
                max = candies[i];
            }
        }

        for (int i = 0; i < candies.length; i++) {
            if ((max - candies[i]) <= extraCandies) {
                list.add(true);
            }else {
                list.add(false);
            }
        }
        return list;
    }





}
