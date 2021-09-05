package algorithm.dynamicProgram;

/**
 * @Author Wang Yin
 * @Date 2021/9/5 15:21
 * 分割等和子集
 * 输入：nums = [1,5,11,5]
 * 输出：true
 * 解释：数组可以分割成 [1, 5, 5] 和 [11]
 */
public class canPartition {

    public boolean canPartition(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result += nums[i];
        }
        if (result % 2 != 0) {
            return false;
        }
        result = result / 2;
        if (nums[0] > result)
            return false;
//        boolean[][] f = new boolean[nums.length][result + 1];
//        f[0][nums[0]] = true;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 1; j < result + 1; j++) {
//                if (nums[i] < j)
//                    f[i][j] = f[i-1][j] || f[i-1][j-nums[i]];
//                else
//                    f[i][j] = f[i-1][j];
//            }
//        }
//        return f[nums.length][result];
        boolean[] f = new boolean[result + 1];
        f[nums[0]] = true;
        f[0] = true;
        for(int i = 1; i < nums.length; i++) {
            for(int j = result; j >= nums[i]; j-- ) {
                f[j] = f[j] || f[j-nums[i]];
            }
        }
        return f[result];

    }


}
