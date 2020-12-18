package com.hfwas.demo;

/**
 *给定两个字符串 s 和 t，它们只包含小写字母。
 * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
 * 请找出在 t 中被添加的字母。
 * 示例 1：
 * 输入：s = "abcd", t = "abcde"
 * 输出："e"
 * 解释：'e' 是那个被添加的字母。
 * 示例 2：
 * 输入：s = "", t = "y"
 * 输出："y"
 */
public class Main {

    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        Main main = new Main();
        char c = main.findTheDifference(s, t);
        System.out.println(c);
    }

    public char findTheDifference(String s, String t) {
        int res = 0;
        int i;
        for (i = 0; i < s.length(); i++) {
            res ^= s.charAt(i) ^ t.charAt(i);
        }
        res ^= t.charAt(i);
        return (char) res;
    }


}
