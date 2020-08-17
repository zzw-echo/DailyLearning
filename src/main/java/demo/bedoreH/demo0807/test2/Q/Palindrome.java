package demo.draft.demo0807.test2.Q;

/**
 * @ Author     ：zhangzewen
 * @ Date       ：Created in 2020/8/6 13:17
 * @ Description：
 */
public class Palindrome {

    //1、找中值
    //2、遍历
    public boolean isPalindrome(ListNode phead) {
        ListNode fast = phead;
        ListNode slow = phead;
        ListNode prev = null;
        ListNode next = null;

        //找中值
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }
        if (fast != null){
            slow = slow.next;
        }

        while (slow!= null){
            if (slow.val != prev.val){
                return false;
            }
            slow = slow.next;
            prev = prev.next;
        }
        return true;


    }

    class ListNode {
        int val;
        ListNode next = null;
    }

}
