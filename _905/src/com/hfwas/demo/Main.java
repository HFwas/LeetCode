package com.hfwas.demo;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 给定一个非负整数数组 A，返回一个数组，在该数组中， A 的所有偶数元素之后跟着所有奇数元素。
 * 你可以返回满足此条件的任何数组作为答案。
 * 示例：
 * 输入：[3,1,2,4]
 * 输出：[2,4,3,1]
 * 输出 [4,2,3,1]，[2,4,1,3] 和 [4,2,1,3] 也会被接受。
 */
public class Main {

    public static void main(String[] args) {

    }

    public int[] sortArrayByParity(int[] num) {//1ms,39.3MB
        if (num.length == 0 || num.length == 1){
            return num;
        }
        //双指针
        int begin = 0;
        int end = num.length - 1;
        int tmp = 0;
        while (begin < end) {
            //左指针指向的是奇数，右指针指向的是偶是，左右做交换
            if ((num[begin] & 1) == 1 && (num[end] & 1) == 0) {
                tmp = num[begin];
                num[begin] = num[end];
                num[end] = tmp;
            }else if ((num[begin] & 1) == 0){
                //左边是偶数，符合题目要求，左指针++
                begin++;
            }else if ((num[end] & 1) == 1) {
                //右指针指向的是奇数，符合题目要求，右指针--
                end--;
            }
        }
        return num;
    }

}
