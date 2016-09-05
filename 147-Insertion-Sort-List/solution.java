/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode curr = head;
        ListNode p = new ListNode(0);
        ListNode next = null;
        while(curr != null)
        {
            next = curr.next;
            ListNode l = p;
            while(l.next != null && l.next.val < curr.val)
            {
                l = l.next;
            }
            curr.next = l.next;
            l.next = curr;
            curr = next;
        }
        return p.next;
    }
}