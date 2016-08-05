/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
        {
            return head;
        }
        ListNode rest = head.next;
        head.next = null;
        ListNode ans = reverseList(rest);
        ListNode temp = ans;
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        temp.next = head;
        return ans;
    }
}