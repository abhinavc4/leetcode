/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {

    /** @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node. */
        int count = 0;
        Random r = null;
        ListNode headOne = null;
    public Solution(ListNode head) {
        ListNode node = head;
        headOne = head;
        while(node!=null)
        {
            count++;
            node = node.next;
        }
        r = new Random();
    }
    /** Returns a random node's value. */
    public int getRandom() {
        int val = r.nextInt(count);
        if(headOne == null)
        {
            return 0;
        }
        if(headOne.next==null)
        {
            return headOne.val;
        }
        System.out.println(val+" " + count);
        ListNode node = headOne;
        while(val>0 && node!=null)
        {
            node = node.next;
            val--;
        }
        return node.val;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */