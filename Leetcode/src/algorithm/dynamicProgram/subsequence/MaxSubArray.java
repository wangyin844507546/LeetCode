package algorithm.dynamicProgram.subsequence;

/**
 * @author Wang Yin
 * @date 2022/5/29 20:26
 * 最大子数组和
 * 给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * 子数组 是数组中的一个连续部分
 *
 * 输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
 * 输出：6
 */
public class MaxSubArray {



    public static int maxSubArray(int[] nums) {
        if(nums.length == 0)
            return 0;
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int res = dp[0];

        for(int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(nums[i], dp[i-1] + nums[i]);
            res = Math.max(res,dp[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
    }
}
