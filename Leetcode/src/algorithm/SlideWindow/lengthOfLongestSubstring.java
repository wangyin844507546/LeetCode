package algorithm.SlideWindow;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Wang Yin
 * @Date 2021/9/24 9:30
 *  76. 最小覆盖子串
 *  给你一个字符串 s 、一个字符串 t 。返回 s 中涵盖 t 所有字符的最小子串。
 *  如果 s 中不存在涵盖 t 所有字符的子串，则返回空字符串 "" 。
 *  输入：s = "ADOBECODEBANC", t = "ABC"
 *  输出："BANC"
 */
public class lengthOfLongestSubstring {

    public static void main(String[] args) {
        minWindow("a","a");
    }

    public static String minWindow(String s, String t) {
        Map<Character,Integer> need = new HashMap<>();
        Map<Character,Integer> window = new HashMap<>();
        for(int i = 0; i < t.length(); i++) {
            need.put(t.charAt(i),need.getOrDefault(t.charAt(i),0) + 1);
        }
        int left = 0, right = 0;
        int valid = 0;
        int start = 0,len = Integer.MAX_VALUE;
        while (right < s.length()) {
            char c = s.charAt(right);
            right++;
            if (need.containsKey(c)) {
                window.put(c,window.getOrDefault(c,0)+1);
                if (window.get(c).equals(need.get(c)))
                    valid++;
            }
            while (valid == need.keySet().size()) {
                if (right - left < len) {
                    start = left;
                    len = right - left;
                }
                char d = s.charAt(left);
                left++;
                if (need.containsKey(d)) {
                    if (window.get(d).equals(need.get(d)))
                        valid--;
                    window.put(d,window.get(d)-1);
                }
            }
        }
        return len == Integer.MAX_VALUE ? "":s.substring(start,start+len);
    }
}
