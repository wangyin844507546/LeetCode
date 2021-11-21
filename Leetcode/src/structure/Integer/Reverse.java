package structure.Integer;

/**
 * @Author Wang Yin
 * @Date 2021/11/21 15:02
 * 7. 整数反转
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
 * 假设环境不允许存储 64 位整数（有符号或无符号）。
 *
 * 输入：x = 123
 * 输出：321
 */
public class Reverse {

    public static int reverse(int x) {
        if (x == 0)
            return 0;
        int result = 0;
        while (x != 0) {
            if (result >= Integer.MAX_VALUE / 10 || result < Integer.MIN_VALUE / 10)
                return 0;
            int k = x % 10;
            x = x / 10;
            result = result * 10 + k;
        }
        return result;
    }

    public static void main(String[] args) {
       reverse(1534236469);
    }
}
