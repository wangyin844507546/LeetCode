package Structure.Array;

/**
 * @Author Wang Yin
 * @Date 2021/9/25 10:33
 * 跳跃游戏
 *
 * 给定一个非负整数数组 nums ，你最初位于数组的 第一个下标 。
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 * 判断你是否能够到达最后一个下标。
 * 输入：nums = [2,3,1,1,4]
 * 输出：true
 * 解释：可以先跳 1 步，从下标 0 到达下标 1, 然后再从下标 1 跳 3 步到达最后一个下标。
 */
public class canJump {


    public boolean canJump(int[] nums) {
        if (nums.length == 1)
            return true;
        int max = 0;
        for (int i =0; i < nums.length; i++) {
            max = Math.max(max, i+nums[i]);
            if (i >= max) {
                return false;
            }
            if (max >= nums.length - 1)
                return true;
        }
        return false;
    }

}
