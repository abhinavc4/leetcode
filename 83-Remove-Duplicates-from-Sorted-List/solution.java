/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)
        {
            return head;
        }
        ListNode currNode = head;
        ListNode currUnique = head;
        head = head.next;
        while(head!=null)
        {
            if(head.val!=currUnique.val)
            {
                currUnique.next = head;
                currUnique = head;
            }
            head = head.next;
        }
        currUnique.next = null;
        return currNode;
    }
}