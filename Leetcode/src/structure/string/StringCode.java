package structure.string;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Wang Yin
 * @Date 2020/11/1 20:42
 *
 * 字符串匹配算法：
 *
 * 1、BF 算法是最简单、粗暴的字符串匹配算法，它的实现思路是，拿模式串与主串中是所有子串匹配，看是否有能匹配的子串。
 * 2、RK 算法是借助哈希算法对 BF 算法进行改造，即对每个子串分别求哈希值，然后拿子串的哈希值与模式串的哈希值比较，减少了比较的时间。
 * 3、BM 算法核心思想是，利用模式串本身的特点，在模式串中某个字符与主串不能匹配的时候，将模式串往后多滑动几位，以此来减少不必要的字符比较，
 * 提高匹配的效率。BM 算法构建的规则有两类，坏字符规则和好后缀规则。好后缀规则可以独立于坏字符规则使用。因为坏字符规则的实现比较耗内存，
 * 为了节省内存，我们可以只用好后缀规则来实现 BM 算法。
 * 4、
 */
public class StringCode {

    /** 1、
     *
     * 编写一个函数来验证输入的字符串是否是有效的 IPv4 或 IPv6 地址。
     *
     * 如果是有效的 IPv4 地址，返回 "IPv4" ；
     * 如果是有效的 IPv6 地址，返回 "IPv6" ；
     * 如果不是上述类型的 IP 地址，返回 "Neither" 。
     * IPv4 地址由十进制数和点来表示，每个地址包含 4 个十进制数，其范围为 0 - 255， 用(".")分割。比如，172.16.254.1；
     *
     * 同时，IPv4 地址内的数不会以 0 开头。比如，地址 172.16.254.01 是不合法的。
     *
     * IPv6 地址由 8 组 16 进制的数字来表示，每组表示 16 比特。这些组数字通过 (":")分割。比如,  2001:0db8:85a3:0000:0000:8a2e:0370:7334 是一个有效的地址。而且，我们可以加入一些以 0 开头的数字，字母可以使用大写，也可以是小写。所以， 2001:db8:85a3:0:0:8A2E:0370:7334 也是一个有效的 IPv6 address地址 (即，忽略 0 开头，忽略大小写)。
     *
     * 然而，我们不能因为某个组的值为 0，而使用一个空的组，以至于出现 (::) 的情况。 比如， 2001:0db8:85a3::8A2E:0370:7334 是无效的 IPv6 地址。
     *
     * 同时，在 IPv6 地址中，多余的 0 也是不被允许的。比如， 02001:0db8:85a3:0000:0000:8a2e:0370:7334 是无效的。
     *
     * @return
     */
    public String validIPAddress(String IP) {
        List<String> ips = new ArrayList<>();
        if (IP.matches("([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])"))
            return "IPv4";
        else if (IP.matches("([0-9a-fA-F]{1,4})"))
            return "IPv6";
        else
            return "Neither";
    }

    /** 2、括号生成
     *
     *数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
     * 示例：
     * 输入：n = 3
     * 输出：[
     *        "((()))",
     *        "(()())",
     *        "(())()",
     *        "()(())",
     *        "()()()"
     *      ]
     *
     * @param n
     * @return
     */
    public List<String> generateParenthesis(int n) {
        return null;
    }



}
