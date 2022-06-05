package algorithm.dynamicProgram.coin;

/**
 * @Author Wang Yin
 * @Date 2021/11/20 15:52
 *
 * 518. 零钱兑换 II
 * 给你一个整数数组 coins 表示不同面额的硬币，另给一个整数 amount 表示总金额。
 * 请你计算并返回可以凑成总金额的硬币组合数。如果任何硬币组合都无法凑出总金额，返回 0 。
 * 假设每一种面额的硬币有无限个。 
 * 题目数据保证结果符合 32 位带符号整数。
 *
 * 输入：amount = 5, coins = [1, 2, 5]
 * 输出：4
 * 解释：有四种方式可以凑成总金额：
 * 5=5
 * 5=2+2+1
 * 5=2+1+1+1
 * 5=1+1+1+1+1
 */
public class CoinChange2 {

    public int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length+1][amount+1];
        for(int i = 0; i < coins.length + 1; i++) {
            dp[i][0] = 1;
        }
        for(int i = 1; i <= coins.length; i++) {
            for (int j = 1; j <= amount; j++) {
                if (j >= coins[i-1]) {
                    dp[i][j] = dp[i-1][j] + dp[i][j - coins[i-1]];
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[coins.length][amount];
    }

    /**
     * 一维解决零钱兑换
     * @param amount
     * @param coins
     * @return
     */
    public int coinChange(int amount,int[] coins ) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int i = 1; i <= coins.length; i++) {
            for (int j = 1; j <= amount; j++) {
                if (j >= coins[i - 1]) {
                    dp[j] = dp[j] + dp[j - coins[i - 1]];
                }
            }
        }
        return dp[amount];
    }
}

