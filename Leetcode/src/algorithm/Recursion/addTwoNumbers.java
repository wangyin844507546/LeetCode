package algorithm.Recursion;

/**
 * @Author Wang Yin
 * @Date 2021/8/8 22:46
 *
 * 两数相加
 * 给你两个非空的链表，表示两个非负的整数。它们每位数字都是按照逆序的方式存储的，并且每个节点只能存储一位数字。
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * 输入：l1 = [2,4,3], l2 = [5,6,4]
 * 输出：[7,0,8]
 * 解释：342 + 465 = 807.
 */
public class addTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        BigDecimal a = BigDecimal.valueOf(Long.valueOf(generateStr(l1)));
//        BigDecimal b = BigDecimal.valueOf(Long.valueOf(generateStr(l2)));
//        BigDecimal c = a.add(b);
//        String str = c.toEngineeringString();
//        algorithm.Recursion.common.ListNode listNode = new algorithm.Recursion.common.ListNode();
//        listNode.val = str.charAt(0);
//        algorithm.Recursion.common.ListNode listNode1 = new algorithm.Recursion.common.ListNode();
//        listNode.next = listNode1;
//        for (int i=1;i< str.length();i++) {
//            listNode1 = new algorithm.Recursion.common.ListNode(str.charAt(i));
//            listNode1.next
//
//        }
        return null;

    }

    private String generateStr(ListNode listNode) {
        String str = "";
        while (listNode.next != null) {
            str = str + String.valueOf(listNode.next);
        }
        return str;
    }
}
