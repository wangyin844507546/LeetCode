package Structure.LinkedList;

import ListNode;

/**
 * @Author Wang Yin
 * @Date 2021/8/15 11:18
 * 删除排序链表中的重复元素
 * 存在一个按升序排列的链表，给你这个链表的头节点 head ，请你删除所有重复的元素，使每个元素 只出现一次 。
 * 返回同样按升序排列的结果链表。
 * 输入：head = [1,1,2]
 * 输出：[1,2]
 */
public class deleteDuplicates {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode tail = head;
        while (tail.next != null) {
            if (tail.val == tail.next.val) {
                tail.next = tail.next.next;
            } else  {
                tail = tail.next;
            }
        }
        return head;
    }
}
