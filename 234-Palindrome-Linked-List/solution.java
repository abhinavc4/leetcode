/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    ListNode reverse(ListNode head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }
        
        ListNode second = head.next;
        head.next = null;
        ListNode rest = reverse(second);
        second.next = head;
        return rest;
    }
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)
        {
            return true;
        }
        
        ListNode prev = head ;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null&&fast.next!=null)
        {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head1= null;
        if(fast == null)
        {
            prev.next = null;
            head1 = reverse(slow);
        }
        else if(fast.next == null)
        {
            prev.next = null;
            slow = slow.next;
            head1 = reverse(slow);
        }
        while(head != null &&
              head1!= null &&
              head.val == head1.val)
              {
                  head = head.next;
                  head1= head1.next;
              }
        if(head1==null && head==null)
        {
              return true;
        }
        return false;
    }
}