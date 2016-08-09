/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;
        if(head == null || n == 0)
        {
            return null;
        }
        while(n>0)
        {
            fast = fast.next;
            n--;
        }
        if(fast == null)
        {
            head = head.next;
            return head;
        }
        while(fast.next!=null)
        {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}