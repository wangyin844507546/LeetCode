package structure.string;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Wang Yin
 * @Date 2021/12/26 18:37
 * 3. 无重复字符的最长子串
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 */
public class LengthOfLongestSubstring {



    public static int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        Map<Character,Integer> memo = new HashMap<>();
        int left = 0;
        int result = 0;
        for(int i=0; i < s.length(); i++) {
            if (memo.containsKey(s.charAt(i))) {
                left = Math.max(left,memo.get(s.charAt(i))+ 1);
            }
            memo.put(s.charAt(i),i);
            result = Math.max(result,i - left + 1);
        }
        return result;
    }

}
