package structure.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author Wang Yin
 * @Date 2021/10/10 18:30
 * 18. 四数之和
 * 给你一个由 n 个整数组成的数组 nums ，和一个目标值 target 。请你找出并返回满足下述全部条件且不重复的四元组 [nums[a], nums[b], nums[c], nums[d]] ：
 *
 * 0 <= a, b, c, d < n
 * a、b、c 和 d 互不相同
 * nums[a] + nums[b] + nums[c] + nums[d] == target
 * 你可以按 任意顺序 返回答案 。
 *
 * 输入：nums = [1,0,-1,0,-2,2], target = 0
 * 输出：[[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
 */
public class fourSum {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length < 4)
            return result;
        int length = nums.length;
        Arrays.sort(nums);
        for(int i = 0; i < length; i++) {

        }
        return result;
    }
}
