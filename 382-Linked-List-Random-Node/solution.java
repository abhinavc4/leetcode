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
        headOne = head;
        r = new Random();
    }
    /** Returns a random node's value. */
    public int getRandom() {
        ListNode p = headOne;
        int count = 1;
        int result = 0;
        while(p!=null)
        {
            if(r.nextInt(count)==0)
            {
                result = p.val;
            }
            p = p.next;
            count++;
        }
        return result;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */