import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author Wang Yin
 * @Date 2020/11/1 22:14
 *  贪心算法一般用来解决需要 “找到要做某事的最小数量” 或 “找到在某些情况下适合的最大物品数量” 的问题，且提供的是无序的输入。
 *
 * 贪心算法的思想是每一步都选择最佳解决方案，最终获得全局最佳的解决方案。

 * 标准解决方案具有 \mathcal{O}(N \log N)O(NlogN) 的时间复杂度且由以下两部分组成：
 *
 * 思考如何排序输入数据（\mathcal{O}(N \log N)O(NlogN) 的时间复杂度）。
 * 思考如何解析排序后的数据（\mathcal{O}(N)O(N) 的时间复杂度）
 *

 */
public class Greedy {

    public static void main(String[] args) {
       // findMinArrowShots(new int[][]{ {10,16},{2,8},{1,6},{7,12} });
        findMinArrowShots(new int[][]{ {-2147483646,-2147483645},{2147483646,2147483647} });
    }

    /**
     * 在二维空间中有许多球形的气球。对于每个气球，提供的输入是水平方向上，气球直径的开始和结束坐标。由于它是水平的，所以纵坐标并不重要，因此只要知道开始和结束的横坐标就足够了。开始坐标总是小于结束坐标。
     *
     * 一支弓箭可以沿着 x 轴从不同点完全垂直地射出。在坐标 x 处射出一支箭，若有一个气球的直径的开始和结束坐标为 xstart，xend， 且满足  xstart ≤ x ≤ xend，则该气球会被引爆。可以射出的弓箭的数量没有限制。 弓箭一旦被射出之后，可以无限地前进。我们想找到使得所有气球全部被引爆，所需的弓箭的最小数量。
     *
     * 给你一个数组 points ，其中 points [i] = [xstart,xend] ，返回引爆所有气球所必须射出的最小弓箭数。
     * 示例 1：
     *
     * 输入：points = [[10,16],[2,8],[1,6],[7,12]]
     * 输出：2
     * 解释：对于该样例，x = 6 可以射爆 [2,8],[1,6] 两个气球，以及 x = 11 射爆另外两个气球

     * @param points
     * @return
     */
    public static int findMinArrowShots(int[][] points) {
        if (points.length == 0) return 0;
        long[][] point1 = new long[][]{};

        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                 return (int)(Long.valueOf(o1[1]) - Long.valueOf(o2[2]));
            }
        });
        int var1 = points[0][1];
        int arrows  = 1;
        for (int[] p:points) {
            int start = p[0], end = p[1];
            if (var1 < start) {
                arrows ++;
                var1 = end;
            }
        }
        return arrows ;
    }

    /** 买卖股票的最佳时机 II
     * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
     * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
     * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
     *
     *
     * 示例 1:
     *
     * 输入: [7,1,5,3,6,4]
     * 输出: 7
     *
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        return 0;
    }

    /** 所有排列中的最大和
     * 有一个整数数组 nums ，和一个查询数组 requests ，其中 requests[i] = [starti, endi] 。第 i 个查询求 nums[starti] + nums[starti + 1] + ... + nums[endi - 1] + nums[endi] 的结果 ，starti 和 endi 数组索引都是 从 0 开始 的。
     * 你可以任意排列 nums 中的数字，请你返回所有查询结果之和的最大值。
     * 由于答案可能会很大，请你将它对 109 + 7 取余 后返回。
     *
     * 示例 1：
     *
     * 输入：nums = [1,2,3,4,5], requests = [[1,3],[0,1]]
     * 输出：19
     * @param nums
     * @param requests
     * @return
     */
    public int maxSumRangeQuery(int[] nums, int[][] requests) {
        return  0;
    }
}
