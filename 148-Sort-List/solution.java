/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null)
        {
            return head;
        }
        
        ListNode slow = head;
        ListNode fast = head.next.next;
        while(fast!=null&&fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode node2 = sortList(slow.next);
        slow.next = null;
        ListNode node1 = sortList(head);
        return merge(node1,node2);
    }
    public ListNode merge(ListNode left,ListNode right)
    {
        ListNode dummy = new ListNode(100);
        ListNode p1 = dummy;
        while(left!=null && right!=null)
        {
            if(left.val<=right.val)
            {
                p1.next = new ListNode(left.val);;
                left = left.next;
            }
            else if(left.val>right.val)
            {
                p1.next = new ListNode(right.val);;
                right = right.next;
            }
            p1 = p1.next;
        }
        if(left == null)
        {
            p1.next = right;
        }
        else if(right == null)
        {
            p1.next = left;
        }
        return dummy.next;
    }
}