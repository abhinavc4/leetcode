/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode curr = head;
        int carry = 0;
        while(carry==1||l1!=null||l2!=null)
        {
            int valOne = 0;
            int valTwo = 0;
            if(l1!=null)
            {
                valOne = l1.val;
                l1 = l1.next;
            }
            if(l2!=null)
            {
                valTwo = l2.val;
                l2 = l2.next;
            }
            int sum = (valOne+valTwo+carry)%10;
            carry = (valOne+valTwo+carry)/10;
            ListNode temp = new ListNode(sum);
            curr.next = temp;
            curr = temp;
        }
        return head.next;
    }
}