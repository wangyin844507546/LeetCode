package algorithm.BackTrack;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author Wang Yin
 * @Date 2021/12/29 9:38
 */
public class SubSet {

    static List<List<Integer>> res = new LinkedList<>();

    public static void main(String[] args) {
        subset(new int[]{1,2,3});
    }

    public static List<List<Integer>> subset(int[] nums) {
        // 记录「路径」
        LinkedList<Integer> track = new LinkedList<>();
        backtrack(nums,0, track);
        return res;
    }

    private static void backtrack(int[] nums, int start, LinkedList<Integer> track) {
        res.add(new LinkedList(track));
        for (int i = start; i < nums.length; i++) {
            track.add(nums[i]);
            backtrack(nums,i+1,track);
            track.removeLast();
        }

    }

}
