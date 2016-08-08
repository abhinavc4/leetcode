/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
        {
            return head;
        }
        ListNode temp = head;
        head = head.next;
        ListNode prevFirst = null;
        while(temp!=null && temp.next != null)
        {
            ListNode first = temp;
            temp = temp.next;
            
            ListNode second = temp;
            temp = temp.next;
            
            first.next = second.next;
            second.next = first;
            
            if(null != prevFirst)
            {
                prevFirst.next = second;
            }
            prevFirst = first;
        }
        return head;
    }
}