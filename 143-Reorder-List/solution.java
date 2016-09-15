/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head)
    {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = head;
        while(curr!=null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = head;
        if(head == null || head.next == null)
        {
            return;
        }
        while(slow!=null&&fast!=null&&fast.next!=null)
        {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secondHead = slow.next;
        slow.next = null;
        secondHead = reverseList(secondHead);
        ListNode temp = head;
        while(temp !=null && secondHead != null)
        {
            ListNode first = temp;
            ListNode second = secondHead;
            temp = temp.next;
            secondHead = secondHead.next;
            
            first.next = second;
            second.next = temp;
        }
    }
}