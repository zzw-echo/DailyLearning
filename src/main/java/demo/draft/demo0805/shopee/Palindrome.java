package demo.draft.demo0805.shopee;

/**
 * @ Author     ：zhangzewen
 * @ Date       ：Created in 2020/8/5 21:15
 * @ Description：
 */
public class Palindrome {


    public boolean isPalindrome(ListNode phead){
        if (phead == null || phead.next == null)  return true;

        ListNode prev = null;
        ListNode fast = phead;
        ListNode slow = phead;


        while (fast != null && fast.next != null){
            fast = fast.next.next;
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }
        if (fast!=null) slow = slow.next;

        while (slow != null){
            if (slow.val != prev.val){
                return false;
            }
            slow = slow.next;
            prev = prev.next;
        }
        return true;
    }

    public class ListNode {
        int val;
        ListNode next = null;
    }
}
