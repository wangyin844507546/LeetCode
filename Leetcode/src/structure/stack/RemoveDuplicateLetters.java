package structure.stack;

import java.util.Stack;

/**
 * @Author Wang Yin
 * @Date 2021/11/28 9:48
 * 316. 去除重复字母
 * 给你一个字符串 s ，请你去除字符串中重复的字母，使得每个字母只出现一次。
 * 需保证 返回结果的字典序最小（要求不能打乱其他字符的相对位置）。
 */
public class RemoveDuplicateLetters {

    public static void main(String[] args) {
        removeDuplicateLetters("cbacdcbc");
    }

    public static String removeDuplicateLetters(String s) {
        Stack<Character> stack = new Stack<>();
        int[] count = new int[256];
        for (char c:s.toCharArray()) {
            count[c]++;
        }
        boolean[] isInStack = new boolean[256];
        for (char c:s.toCharArray()) {
            count[c]--;
            if(isInStack[c])
                continue;
            while (!stack.isEmpty() && stack.peek() > c) {
                if(count[stack.peek()] == 0)
                    break;
                isInStack[stack.pop()] = false;
            }
            stack.push(c);
            isInStack[c] = true;
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }

}
