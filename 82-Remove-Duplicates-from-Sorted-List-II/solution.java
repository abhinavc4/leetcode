/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    //Given 1->2->3->3->4->4->5->5, return 1->2
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode p = dummy;
        while(p!=null && p.next!=null && p.next.next!=null)
        {
            if(p.next.val==p.next.next.val)
            {
                int dup = p.next.val;
                while(p.next != null && p.next.val == dup)
                {
                    p.next = p.next.next;
                }
            }
            else
            {
                p = p.next;
            }
        }
        return dummy.next;
    }
}