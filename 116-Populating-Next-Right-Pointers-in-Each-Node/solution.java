/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        Queue<TreeLinkNode> q = new LinkedList<TreeLinkNode>();
        if(root == null)
        {
            return ;
        }
        q.add(root);
        root.next = null;
        while(!q.isEmpty())
        {
            TreeLinkNode n = q.remove();
            if(n != null)
            {
                TreeLinkNode left = n.left;
                TreeLinkNode right = n.right;
                if(left!=null)
                {
                    left.next = right;
                    if(n.next == null)
                    {
                        right.next = null;
                    }
                    else
                    {
                        right.next = n.next.left ;
                    }
                    q.add(left);
                    q.add(right);
                }
            }
        }
    }
}