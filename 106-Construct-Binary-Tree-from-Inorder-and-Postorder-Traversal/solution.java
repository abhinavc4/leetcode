/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Deque<TreeNode> dq = new LinkedList<TreeNode>();
        if(inorder.length==0 || postorder.length==0)
        {
            return null;
        }
        int i = inorder.length - 1;
        int p = i;
        TreeNode root = new TreeNode(postorder[i]);
        dq.addFirst(root);
        p--;
        while(true)
        {
            if(inorder[i] == dq.peekFirst().val)
            {
                if(--i<0)
                {
                    break;
                }
                TreeNode node = dq.removeFirst();
                if(!dq.isEmpty() && dq.peekFirst().val==inorder[i])
                {
                    continue;
                }
                node.left = new TreeNode(postorder[p]);
                dq.addFirst(node.left);
            }
            else
            {
                TreeNode node = new TreeNode(postorder[p]);
                dq.peekFirst().right = node;
                dq.addFirst(node);
            }
            p--;
        }
        return root;
    }
}