package algorithm.dynamicProgram;

/**
 * @author Wang Yin
 * @date 2020/11/4 20:15\「力扣」上的 0-1 背包问题：
 *
 * 「力扣」第 416 题：分割等和子集（中等）；
 * 「力扣」第 474 题：一和零（中等）；
 * 「力扣」第 494 题：目标和（中等）；
 * 「力扣」第 879 题：盈利计划（困难）；
 * 「力扣」上的 完全背包问题：
 *
 * 「力扣」第 322 题：零钱兑换（中等）；
 * 「力扣」第 518 题：零钱兑换 II（中等）；
 * 「力扣」第 1449 题：数位成本和为目标值的最大数字（困难）。
 *
 */
public class DynamicProgramming {

    /**
     *  5、零钱兑换
     *
     *  给定不同面额的硬币 coins 和一个总金额 amount。编写一个函数来计算可以凑成总金额所需的最少的硬币个数。如果没有任何一种硬币组合能组成总金额，返回 -1。
     *
     * 你可以认为每种硬币的数量是无限的。
     *
     * 示例 1：
     *
     * 输入：coins = [1, 2, 5], amount = 11
     * 输出：3
     * 解释：11 = 5 + 5 + 1
     * @param coins
     * @param amount
     * @return
     */
    public int coinChange(int[] coins, int amount) {
        return 0;
    }

    /**
     *  6、目标和
     *
     *  给定一个非负整数数组，a1, a2, ..., an, 和一个目标数，S。现在你有两个符号 + 和 -。对于数组中的任意一个整数，你都可以从 + 或 -中选择一个符号添加在前面。
     *
     * 返回可以使最终数组和为目标数 S 的所有添加符号的方法数。
     *
     * 示例：
     *
     * 输入：nums: [1, 1, 1, 1, 1], S: 3
     * 输出：5
     * 解释：
     *
     * -1+1+1+1+1 = 3
     * +1-1+1+1+1 = 3
     * +1+1-1+1+1 = 3
     * +1+1+1-1+1 = 3
     * +1+1+1+1-1 = 3
     *
     * 一共有5种方法让最终目标和为3。
     *
     * @param nums
     * @param S
     * @return
     */
    public int findTargetSumWays(int[] nums, int S) {
        return 0;
    }


}
