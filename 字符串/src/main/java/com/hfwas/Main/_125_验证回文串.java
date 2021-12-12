package com.hfwas.Main;

/**
 * @Author HFwas
 * https://leetcode-cn.com/problems/valid-palindrome/
 * @Date 2021/12/12 15:05
 */
public class _125_验证回文串 {
    public static void main(String[] args) {
//        boolean adkood = isPalindrome("adkood");
        boolean adkood = isPalindrome(" ab !@Ba");
        System.out.println(adkood);
    }

    private static boolean isPalindrome(String s) {
        // 高层次（主干）逻辑
        // 1.filter out number && char
        // 2. reverse and compare

        // 可以忽略字母的大小写。
        String filterStrign = filterNonNumberAndChar(s);
        // 反转字符，比较
        String reverseString = reverseString(filterStrign);
        return filterStrign.equalsIgnoreCase(reverseString);
    }

    private static String reverseString(String filterStrign) {
        return new StringBuilder(filterStrign).reverse().toString();
    }

    private static String filterNonNumberAndChar(String s) {
        return s.replaceAll("[^a-zA-Z0-9]", "");
    }
}
