package algorithm.dynamicProgram.subsequence;

import algorithm.dynamicProgram.subsequence.LongestCommonSubsequence;

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
public class MinDistance {

    public int minDistance(String word1, String word2) {
         int longestCommonSubsequence = LongestCommonSubsequence.longestCommonSubsequence(word1,word2);
         return word1.length() + word2.length() - longestCommonSubsequence - longestCommonSubsequence;
    }

}
