/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode node1 = new ListNode(0);
        ListNode p1 = node1;
        ListNode node2 = new ListNode(0);
        ListNode p2 = node2;
        while(head != null)
        {
            if(head.val<x)
            {
                p1 = p1.next = head;
            }
            else
            {
                p2 = p2.next = head;
            }
            head = head.next;
        }
        p2.next = null;
        p1.next = node2.next;
        return node1.next;
    }
}