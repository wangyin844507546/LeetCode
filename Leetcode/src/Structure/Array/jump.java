package Structure.Array;

/**
 * @Author Wang Yin
 * @Date 2021/9/25 10:41
 * 跳跃游戏 II
 * 给你一个非负整数数组 nums ，你最初位于数组的第一个位置。
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 * 你的目标是使用最少的跳跃次数到达数组的最后一个位置。
 * 假设你总是可以到达数组的最后一个位置。
 *
 * 输入: nums = [2,3,1,1,4]
 * 输出: 2
 * 解释: 跳到最后一个位置的最小跳跃数是 2。
 *      从下标为 0 跳到下标为 1 的位置，跳 1 步，然后跳 3 步到达数组的最后一个位置。
 *
 */
public class jump {

    public static void main(String[] args) {
        jump(new int[] {2,3,1,1,1,4});
    }

    public static int jump(int[] nums) {
        if (nums.length == 1)
            return 0;
       int step = 0;
       int max = 0;
       for(int i = 0; i < nums.length - 1; i++) {
           if (max == i)
               step++;
           max = Math.max(max,i + nums[i]);
       }
       return step;
    }
}
