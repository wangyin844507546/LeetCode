package structure.linkedList;

import common.ListNode;

/**
 * @Author Wang Yin
 * @Date 2021/8/28 11:10
 * 删除链表的倒数第 n 个结点
 * 给定一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 *
 * 输入：head = [1,2,3,4,5], n = 2
 * 输出：[1,2,3,5]
 *
 */
public class RemoveNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tail = head;
        ListNode dump = head;
        while (n != 0) {
            tail = tail.next;
            if (tail == null) {
                return head.next;
            }
            n--;
        }
        while (tail.next !=null) {
            dump = dump.next;
            tail = tail.next;
        }
        dump.next = dump.next.next;
        return head;
    }
}
