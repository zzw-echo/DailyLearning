package demo.bedoreH.demo0806.shopee;

/**
 * @ Author     ：zhangzewen
 * @ Date       ：Created in 2020/8/6 12:12
 * @ Description：
 */
public class Palindrome {

    public boolean isPalindrome(ListNode phead) {

        if (phead == null || phead.next == null) return true;

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
        if (fast.next != null) slow = slow.next;

        while (slow != null) {
            if (slow.val != prev.val) return false;
            slow = slow.next;
            prev = prev.next;
        }
        return true;
    }

    private class ListNode {
        int val;
        ListNode next = null;
    }

}
