package algorithm.dynamicProgram;

/**
 * @Author Wang Yin
 * @Date 2021/9/5 22:23
 * 最长公共子序列
 * 给定两个字符串 text1 和 text2，返回这两个字符串的最长 公共子序列 的长度。如果不存在 公共子序列 ，返回 0 。
 *
 * 一个字符串的 子序列 是指这样一个新的字符串：它是由原字符串在不改变字符的相对顺序的情况下删除某些字符（也可以不删除任何字符）后组成的新字符串。
 *
 * 例如，"ace" 是 "abcde" 的子序列，但 "aec" 不是 "abcde" 的子序列。
 * 两个字符串的 公共子序列 是这两个字符串所共同拥有的子序列。
 *输入：text1 = "abcde", text2 = "ace"
 * 输出：3
 * 解释：最长公共子序列是 "ace" ，它的长度为 3 。
 */
public class longestCommonSubsequence {


    public static int longestCommonSubsequence(String text1, String text2) {
        int length1 = text1.length();
        int length2 = text2.length();
        int[][] result = new int[length1+1][length2+1];
        for (int i = 1 ; i <= length1; i++) {
            char char1 = text1.charAt(i-1);
            for (int j = 1; j <= length2; j++) {
                char char2 = text2.charAt(j-1);
                if (char1 == char2) {
                    result[i][j] = result[i-1][j-1] + 1;
                } else {
                    result[i][j] = Math.max(result[i-1][j],result[i][j-1]);
                }
            }
        }
        return result[length1][length2];
    }

    public static void main(String[] args) {
        longestCommonSubsequence("abcde","ace");
    }
}
