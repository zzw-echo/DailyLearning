package demo.draft.demo0805;

/**
 * @ Author     ：zhangzewen
 * @ Date       ：Created in 2020/8/5 15:06
 * @ Description：虾皮
 */
public class demo2 {


    public class Solution {
        /**
         * @param pHead ListNode类
         * @return bool布尔型
         */
        public boolean isPalindrome(ListNode pHead) {
            // write code here
            if (pHead == null) return true;

            ListNode midNode = findMidNode(pHead);
            ListNode secondHalfHead = reverseLinked(midNode.next);
            ListNode cur1 = pHead;
            ListNode cur2 = secondHalfHead;

            boolean palindrome = true;
            while (palindrome && cur2 != null) {
                if (cur1.val != cur2.val) palindrome = false;
                cur1 = cur1.next;
                cur2 = cur2.next;
            }
            return palindrome;
        }
    }

    private ListNode reverseLinked(ListNode pHead) {
        ListNode cur = pHead;
        ListNode prev = null;
        while (cur != null) {
            ListNode nextTemp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nextTemp;
        }
        return prev;
    }

    private ListNode findMidNode(ListNode pHead) {
        ListNode fast = pHead;
        ListNode low = pHead;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            low = low.next;
        }
        return low;
    }

}
