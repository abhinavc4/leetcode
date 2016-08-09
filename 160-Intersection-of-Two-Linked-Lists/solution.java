/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int retLen(ListNode temp)
    {
        int count = 0;
        while(temp != null)
        {
            temp = temp.next;
            count++;
        }
        return count;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int l1 = retLen(headA);
        if(l1==0)
        {
            return null;
        }
        
        int l2 = retLen(headB);
        if(l2==0)
        {
            return null;
        }
        
        while(l1>l2)
        {
            headA = headA.next;
            l1--;
        }
        
        while(l2>l1)
        {
            headB = headB.next;
            l2--;
        }
        
        while(headA != null && headB != null)
        {
            if(headA==headB)
            {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}