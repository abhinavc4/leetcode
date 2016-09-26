/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode then = null;
        ListNode start = null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        for(int i = 0 ; i < m-1;i++)
        {
            prev = prev.next;
        }
        if(prev!=null)
        {
            start = prev.next;     
        }
        if(start!=null)
        {
            then = start.next;    
        }
        for(int i = 0 ; i < n-m ; i++)
        {
            
            start.next = then.next;
            then.next = prev.next;
            prev.next = then;
            then = start.next;
        }
        return dummy.next;
    }
}