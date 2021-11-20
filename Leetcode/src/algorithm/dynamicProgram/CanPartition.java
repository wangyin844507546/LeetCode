package algorithm.dynamicProgram;

/**
 * @Author Wang Yin
 * @Date 2021/9/5 15:21
 * 分割等和子集
 * 输入：nums = [1,5,11,5]
 * 输出：true
 * 解释：数组可以分割成 [1, 5, 5] 和 [11]
 */
public class CanPartition {

    public static boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if (sum % 2 != 0) {
            return false;
        }
        sum = sum / 2;
        boolean[] dp = new boolean[sum + 1];
        dp[0] = true;
        for (int i = 0; i < nums.length; i++) {
            for (int j = sum; j >= nums[i]; j--) {
                dp[j] = dp[j] || dp[j - nums[i]];
            }
        }
        return dp[sum];


//        int result = 0;
//        for (int i = 0; i < nums.length; i++) {
//            result += nums[i];
//        }
//        if (result % 2 != 0) {
//            return false;
//        }
//        result = result / 2;
//        if (nums[0] > result)
//            return false;
//        boolean[] f = new boolean[result + 1];
//        f[nums[0]] = true;
//        f[0] = true;
//        for(int i = 1; i < nums.length; i++) {
//            for(int j = result; j >= nums[i]; j-- ) {
//                f[j] = f[j] || f[j-nums[i]];
//            }
//        }
//        return f[result];
    }

    public static void main(String[] args) {
        canPartition(new int[] {1,2,5});
    }


}
