package algorithm.BackTrack;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author Wang Yin
 * @Date 2021/12/29 10:19
 */
public class Combine {

    static List<List<Integer>> res = new LinkedList<>();

    public static void main(String[] args) {
        combine(4,2);
    }

    public static List<List<Integer>> combine(int n, int k) {
        LinkedList<Integer> track = new LinkedList<>();
        backtrack(n,k,1, track);
        return res;
    }

    private static void backtrack(int n, int k, int start, LinkedList<Integer> track) {
        if (k == track.size()) {
            res.add(new LinkedList<>(track));
            return;
        }

        for (int i = start; i <= n; i++) {
            track.add(i);
            backtrack(n,k,i+1,track);
            track.removeLast();
        }


    }


}
