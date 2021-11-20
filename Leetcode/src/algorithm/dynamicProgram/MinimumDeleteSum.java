package algorithm.dynamicProgram;

import java.util.Arrays;

/**
 * @Author Wang Yin
 * @Date 2021/11/20 10:37
 * 712.两个字符串的最小ASCII删除和
 * 给定两个字符串s1, s2，找到使两个字符串相等所需删除字符的ASCII值的最小和。
 *
 * 输入: s1 = "sea", s2 = "eat"
 * 输出: 231
 * 解释: 在 "sea" 中删除 "s" 并将 "s" 的值(115)加入总和。
 * 在 "eat" 中删除 "t" 并将 116 加入总和。
 * 结束时，两个字符串相等，115 + 116 = 231 就是符合条件的最小和。
 *
 */
public class MinimumDeleteSum {

    static int memo[][];
    /* 主函数 */
    static int minimumDeleteSum(String s1, String s2) {
        int m = s1.length(), n = s2.length();
        // 备忘录值为 -1 代表未曾计算
        memo = new int[m][n];
        for (int[] row : memo)
            Arrays.fill(row, -1);

        return dp(s1, 0, s2, 0);
    }

    public static int dp(String str1,int i,String str2,int j) {
        int res = 0;

        if (str1.length() == i) {
            for(; j < str2.length();j++) {
                res+=str2.charAt(j);
            }
            return res;
        }
        if (str2.length() == j) {
            for (;i < str1.length();i++) {
                res+=str1.charAt(i);
            }
            return res;
        }

        if(memo[i][j] != -1) {
            return memo[i][j];
        }

        if (str1.charAt(i) == str2.charAt(j)) {
            memo[i][j] = dp(str1,i+1,str2,j+1);
        } else {
            memo[i][j] = Math.min(dp(str1,i+1,str2,j) + str1.charAt(i),
                    dp(str1,i,str2,j+1)+str2.charAt(j));
        }
        return memo[i][j];
    }

    public static void main(String[] args) {
        minimumDeleteSum("ccaccjp","fwosarcwge");
    }

}

