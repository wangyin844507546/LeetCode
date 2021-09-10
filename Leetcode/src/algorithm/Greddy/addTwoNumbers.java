package algorithm.Greddy;

import Structure.ListNode;

/**
 * @Author Wang Yin
 * @Date 2021/8/28 21:31
 * 两数相加
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *输入：l1 = [2,4,3], l2 = [5,6,4]
 * 输出：[7,0,8]
 * 解释：342 + 465 = 807.
 *
 *
 */
public class addTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head;
        ListNode tail = new ListNode(-1);
        head = tail;
        int temp = 0;
        while (l1 != null && l2 != null) {
             ListNode tempListNode = new ListNode((l1.val + l2.val + temp) % 10);
             temp = (l1.val + l2.val+ temp) / 10;
            tail.next = tempListNode;
            tail = tail.next;
             l1 = l1.next;
             l2 = l2.next;
        }
        while (l1 != null) {
            ListNode tempListNode = new ListNode((l1.val + temp) % 10);
            temp = (l1.val + temp) / 10;
            tail.next = tempListNode;
            tail = tail.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            ListNode tempListNode = new ListNode((l2.val + temp) % 10);
            temp = (l2.val + temp) / 10;
            tail.next = tempListNode;
            tail = tail.next;
            l2 = l2.next;
        }
        if (temp != 0) {
            tail.next = new ListNode(temp);
        }
        return head.next;
    }

    public static void main(String[] args) {
//        ListNode head1;
//        ListNode head2;
//        ListNode l1 = new ListNode(1);
//        ListNode l2 = new ListNode(3);
//        head1 = l1;
//        head2 = l2;
//        int i = 5;
//        while (i-- > 0) {
//            ListNode listNode = new ListNode(i);
//            l1.next = listNode;
//            l2.next = listNode;
//            l1 = l1.next;
//            l2 = l2.next;
//        }
//        addTwoNumbers(head1,head2);
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        addTwoNumbers(l1,l2);
    }

}
