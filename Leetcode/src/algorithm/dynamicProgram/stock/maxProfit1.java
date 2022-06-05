package algorithm.dynamicProgram.stock;

/**
 * @author Wang Yin
 * @date 2022/6/3 20:51\
 * 121. 买卖股票的最佳时机
 * 给定一个数组 prices ，它的第 i 个元素 prices[i] 表示一支给定股票第 i 天的价格。
 * 你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
 * 返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。
 *
 *
 *
 */
public class maxProfit1 {


    public static int maxProfit(int[] prices) {
        int res = 0;
        if (prices.length <= 1)
            return res;
        int min = prices[0];

        for(int i = 1; i < prices.length; i++) {
            if (prices[i] < min)
                min = prices[i];
            res = Math.max(res, prices[i] - min);
        }
        return res;
    }

    public static void main(String[] args) {
        maxProfit(new int[]{7,1,5,3,6,4});
    }

}
