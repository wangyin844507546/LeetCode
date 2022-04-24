package structure.linkedList;

import common.ListNode;

/**
 * @Author Wang Yin
 * @Date 2021/11/21 17:53
 */
public class HasCycle {

    public static boolean hasCycle(ListNode head) {
        ListNode slow = head , fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;

    }


}
