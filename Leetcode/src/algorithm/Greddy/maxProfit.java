package algorithm.Greddy;

/**
 * @Author Wang Yin
 * @Date 2021/8/12 23:11
 * 买卖股票的最佳时机 II
 * 给定一个数组 prices ，其中 prices[i] 是一支给定股票第 i 天的价格。
 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 * 输入: prices = [7,1,5,3,6,4]
 * 输出: 7
 */
public class maxProfit {

    public static void main(String[] args) {
        int a = maxProfit(new int[] {7,1,5,3,6,4});
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int a = 0;
        for (int i=1; i < prices.length; i++) {
            a = Math.max(prices[i] - prices[i-1],0);
            maxProfit += a;
        }
        return maxProfit;
    }

}
