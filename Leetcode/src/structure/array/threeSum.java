package structure.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Wang Yin
 * @date 2021/10/9 18:52
 *  三数之和
 *  给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，
 *  使得 a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。
 *
 *  输入：nums = [-1,0,1,2,-1,-4]
 * 输出：[[-1,-1,2],[-1,0,1]]
 *
 */
public class threeSum {

    public static void main(String[] args) {
       threeSum(new int[] {-1,0,1,2,-1,-4});
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int length = nums.length;
        if (length < 3)
            return result;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] > 0)
                break;
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int L = i + 1;
            int R = length - 1;
            while (L < R) {
                if (nums [i] + nums[L] + nums[R] == 0) {
                    result.add(Arrays.asList(nums[i],nums[L],nums[R]));
                    while (L < R && nums[L] == nums[L+1]) L++;
                    while (L < R && nums[R] == nums[R-1]) R--;
                    L++;
                    R--;
                } else if (nums [i] + nums[L] + nums[R] < 0) {
                    L++;
                } else {
                    R--;
                }

            }

        }
        return  result;
    }
}
