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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> l = new ArrayList<Integer>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        int size = q.size();
        while( !q.isEmpty() )
        {
            TreeNode node = q.remove();
            if(node!=null)
            {
                if(node.left!=null)
                {
                    q.add(node.left);    
                }
                if(node.right!=null)
                {
                    q.add(node.right);    
                }
            }
            size--;
            if(size==0)
            {
                size = q.size();
                if(node!=null)
                {
                    l.add(node.val);    
                }
            }
        }
        return l;
    }
}
