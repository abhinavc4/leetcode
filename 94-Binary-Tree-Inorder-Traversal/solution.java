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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<Integer>();
        Deque<TreeNode> st = new LinkedList<TreeNode>();
        while(!st.isEmpty()||root!=null)
        {
            if(root!=null)
            {
                st.addFirst(root);
                root = root.left;
            }
            else
            {
                root = st.removeFirst();
                l.add(root.val);
                root = root.right;
            }
        }
        return l;
    }
}