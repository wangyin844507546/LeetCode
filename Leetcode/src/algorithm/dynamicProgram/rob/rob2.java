package algorithm.dynamicProgram.rob;

import java.util.Arrays;

/**
 * @author Wang Yin
 * @date 2022/6/26 13:16\
 * 213. 打家劫舍 II
 * 你是一个专业的小偷，计划偷窃沿街的房屋，每间房内都藏有一定的现金。这个地方所有的房屋都 围成一圈 ，
 * 这意味着第一个房屋和最后一个房屋是紧挨着的。同时，相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警 。
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你 在不触动警报装置的情况下 ，今晚能够偷窃到的最高金额。
 */
public class rob2 {

    private static int[] memo ;

    public static void main(String[] args) {
        rob2(new int[]{2,3,2});
    }


    public static int rob2(int[] nums) {
        int n = nums.length;

        if (n == 1)
            return nums[0];

        int[] nums1 = nums.clone();
        nums1[nums1.length - 1] = 0;
        int[] nums2 = nums.clone();
        nums2[0] = 0;
        return Math.max(rob(nums1),rob(nums2));

    }

    public static int rob(int[] nums) {
        memo = new int[nums.length];
        Arrays.fill(memo,-1);
        int res = dp(nums,0);
        return res;
    }

    // 自顶向下
    public static int dp(int[] nums, int start){
        if (start >= nums.length)
            return 0;

        if (memo[start] != -1)
            return memo[start];

        int res = Math.max(dp(nums,start+1),nums[start] + dp(nums,start+2));
        memo[start] = res;
        return res;

    }
}
