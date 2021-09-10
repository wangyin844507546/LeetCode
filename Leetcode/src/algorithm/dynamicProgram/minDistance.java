package algorithm.dynamicProgram;

/**
 * @Author Wang Yin
 * 两个字符串的删除操作
 * 给定两个单词 word1 和 word2，找到使得 word1 和 word2 相同所需的最小步数，每步可以删除任意一个字符串中的一个字符。
 *
 * 输入: "sea", "eat"
 * 输出: 2
 * 解释: 第一步将"sea"变为"ea"，第二步将"eat"变为"ea"
 *
 * @Date 2021/9/10 10:53
 */
public class minDistance {

    public int minDistance(String word1, String word2) {
         int longestCommonSubsequence = longestCommonSubsequence(word1,word2);
         return word1.length() + word2.length() - longestCommonSubsequence - longestCommonSubsequence;
    }


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
}
