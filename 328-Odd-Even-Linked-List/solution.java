/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode oddEvenList(ListNode head) {
        ArrayList<ListNode> al = new ArrayList<ListNode>();
        ListNode temp = head;
        int count = 2;
        while(temp!=null && count >0)
        {
            count--;
            al.add(temp);
            temp = temp.next;
        }
        if(count >0)
        {
            return head;
        }
        ListNode evenHead = al.get(1);
        int index = 0;
        while(temp != null)
        {
            al.get(index).next = temp;
            al.set(index,temp);
            index = (index+1)%2;
            temp = temp.next;
        }
        al.get(0).next = evenHead;
        al.get(1).next = null;
        return head;
        
    }
}