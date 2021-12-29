package algorithm.BackTrack;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author Wang Yin
 * @Date 2021/12/29 20:52
 */
public class GenerateParenthesis {



    public static void main(String[] args) {
        generateParenthesis(1);
    }

    public static List<String> generateParenthesis(int n) {
        LinkedList<String> res = new LinkedList<>();
        String track = "";
        backTrack(n,n,track,res);
        return res;
    }

    public static void backTrack(int left,int right,String track,LinkedList<String> res){

        if (right < left) return;
        if (right < 0 || left < 0)
            return;
        if (left == 0 && right == 0) {
            res.add(track);
            return;
        }
        track = track.concat("(");
        backTrack(left-1,right,track,res);
        track = track.substring(0,track.length()-1);

        track = track.concat(")");
        backTrack(left,right-1,track,res);
        track = track.substring(0,track.length()-1);

    }

}
