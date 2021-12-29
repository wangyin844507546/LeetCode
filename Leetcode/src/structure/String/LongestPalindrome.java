package structure.String;

import com.sun.deploy.util.StringUtils;

import java.util.Arrays;

/**
 * @Author Wang Yin
 * @Date 2021/8/24 22:01
 * 409. 最长回文子串
 * 给定一个包含大写字母和小写字母的字符串，找到通过这些字母构造成的最长的回文串。
 * 在构造过程中，请注意区分大小写。比如 "Aa" 不能当做一个回文字符串。
 * 注意:
 * 假设字符串的长度不会超过 1010。
 * 输入:
 * "abccccdd"
 * 输出:
 * 7
 *
 * 5.最长回文子串
 * 给你一个字符串 s，找到 s 中最长的回文子串。
 * 输入：s = "babad"
 * 输出："bab"
 * 解释："aba" 同样是符合题意的答案。
 */
public class LongestPalindrome {


    public static int longestPalindrome(String s) {
        return longestCommonSubsequence_recursion(s,s);
    }

    static int[][] memo;
    public static int longestCommonSubsequence_recursion(String test1,String text2) {
        int i = test1.length(), j = text2.length();
        memo = new int[i][j];
        for (int[] row: memo) {
            Arrays.fill(row,-1);
        }
        return dp(test1,0,text2,0);
    }

    private static int dp(String test1, int i, String text2, int i1) {
        return 1;
    }
}
