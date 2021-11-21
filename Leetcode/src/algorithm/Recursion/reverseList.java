package algorithm.Recursion;

import common.ListNode;

import java.util.List;

/**
 * @Author Wang Yin
 * @Date 2021/8/16 23:19
 * 反转链表
 * 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 * 输入：head = [1,2,3,4,5]
 * 输出：[5,4,3,2,1]
 */
public class reverseList {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode dump = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return dump;
    }

    // todo
    public  ListNode reverseList(ListNode head,int k) {
        if (k == 0)
            return head;
        ListNode dump = reverseList(head.next, k--);
        head.next.next = head;
        head.next = null;
        return dump;
    }
}
