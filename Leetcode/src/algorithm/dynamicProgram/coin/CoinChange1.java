package algorithm.dynamicProgram.coin;

import java.util.Arrays;

/**
 * @author Wang Yin
 * @date 2022/5/22 18:58\
 * 322. 零钱兑换
 * 给你一个整数数组 coins ，表示不同面额的硬币；以及一个整数 amount ，表示总金额。
 * 计算并返回可以凑成总金额所需的 最少的硬币个数 。如果没有任何一种硬币组合能组成总金额，返回 -1 。
 * 你可以认为每种硬币的数量是无限的。
 */
public class CoinChange1 {

    public static int coinChange(int[] coins, int amount) {

        int[] dp = new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0] = 0;
        for (int j = 1; j <= amount; j++) {
            for (int i = 1; i <= coins.length; i++) {
                if (j < coins[i - 1]) {
                    continue;
                }
                dp[j] = Math.min(dp[j],dp[j-coins[i-1]] + 1);
            }
        }
        return dp[amount] == amount + 1 ? -1:dp[amount];
    }


    public static void main(String[] args) {
        coinChange(new int[] {1,2,5},11);
    }



}
