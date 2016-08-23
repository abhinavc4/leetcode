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
    public List<Integer> preorderTraversal(TreeNode root) {
        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        List<Integer> l = new ArrayList<Integer>();
        while(root!=null || !stack.isEmpty())
        {
            if(root!=null)
            {
                l.add(new Integer(root.val));
                if(root.left != null||root.right!=null)
                {
                    stack.addFirst(root);
                }
                root=root.left;
            }
            else
            {
                root = stack.removeFirst();
                root = root.right;
            }
        }
        return l;
    }
}