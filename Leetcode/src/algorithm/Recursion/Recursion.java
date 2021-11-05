package algorithm.Recursion;

import structure.String.StringCode;

import java.util.List;

/**
 * @Author Wang Yin
 * @Date 2020/10/31 17:15
 *
 * 说明：只要同时满足以下三个条件
 *  1. 一个问题的解可以分解为几个子问题的解
 *  2. 这个问题与分解之后的子问题，除了数据规模不同，求解思路完全一样
 *  3. 存在递归终止条件
 *
 */
public class Recursion {

    public static void main(StringCode[] args) {
        System.out.println(1^1);
        //kthGrammar(4, 5);
    }

    /**
     * 1、
     * 在第一行我们写上一个 0。接下来的每一行，将前一行中的0替换为01，1替换为10
     * 给定行数 N 和序数 K，返回第 N 行中第 K个字符。（K从1开始）
     * 例子:
     * 输入: N = 1, K = 1
     * 输出: 0
     * 解释:
     * 第一行: 0
     * 第二行: 01
     * 第三行: 0110
     * 第四行: 01101001
     * @param N
     * @param K
     * @return
     */
    public static int kthGrammar(int N, int K) {
        if (N == 1) return 0;
        if (K <= 1 << (N - 2))
            return kthGrammar(N-1,K);
        else
            return kthGrammar(N - 1, K - (1 << N -2)) ^ 1;
    }

    /**
     *  2、斐波那契数列
     *
     *写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项。斐波那契数列的定义如下：
     *
     * F(0) = 0,   F(1) = 1
     * F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
     * 斐波那契数列由 0 和 1 开始，之后的斐波那契数就是由之前的两数相加而得出。
     *
     * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
     */

    public static int fib(int n) {
        if(n == 0)
            return 0;
        if (n == 1)
            return 1;
        return (fib(n -2)  % 1000000007 + fib(n - 1) % 1000000007) % 1000000007;
    }

    /**
     * 3、
     * 在经典汉诺塔问题中，有 3 根柱子及 N 个不同大小的穿孔圆盘，盘子可以滑入任意一根柱子。一开始，所有盘子自上而下按升序依次套在第一根柱子上(即每一个盘子只能放在更大的盘子上面)。移动圆盘时受到以下限制:
     * (1) 每次只能移动一个盘子;
     * (2) 盘子只能从柱子顶端滑出移到下一根柱子;
     * (3) 盘子只能叠在比它大的盘子上。
     *
     * 请编写程序，用栈将所有盘子从第一根柱子移到最后一根柱子。
     *
     * 你需要原地修改栈。
     *
     * 示例1:
     *
     *  输入：A = [2, 1, 0], B = [], C = []
     *  输出：C = [2, 1, 0]
     * 示例2:
     *
     *  输入：A = [1, 0], B = [], C = []
     *  输出：C = [1, 0]
     *
     * @param A
     * @param B
     * @param C
     */
    public void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {

    }

}
