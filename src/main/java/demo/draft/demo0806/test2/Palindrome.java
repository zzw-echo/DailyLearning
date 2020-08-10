package demo.draft.demo0806.test2;

/**
 * @ Author     ：zhangzewen
 * @ Date       ：Created in 2020/8/6 14:36
 * @ Description：
 */
public class Palindrome {

    public boolean isPalindrome(ListNode phead) {

        ListNode fast = phead;
        ListNode slow = phead;
        ListNode prev = null;
        ListNode next = null;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        if (fast != null) {
            slow = slow.next;
        }

        while (slow.next != null) {
            if (slow.val != prev.val) {
                return false;
            }
            slow = slow.next;
            prev = prev.next;
        }
        return true;
    }

    private class ListNode {
        int val;
        ListNode next;
    }
}
