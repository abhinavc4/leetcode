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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        if(root==null)
        {
            return res;    
        }
        LinkedList<Integer> result = new LinkedList<Integer>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        int nodes = 1;
        
        q.add(root);
        boolean forward = true;
        while(!q.isEmpty())
        {
            TreeNode curr = q.remove();
            if(forward)
            {
                result.add(curr.val);
            }
            else
            {
                result.addFirst(curr.val);
            }
            
            if(null != curr.left)
            {
                q.add(curr.left);
            }
            
            if(null != curr.right)
            {
                q.add(curr.right);
            }
            
            nodes--;
            if(nodes==0)
            {
                forward = !forward;
                if(result.size()!=0)
                {
                    res.add(result);    
                }
                nodes = q.size();
                result = new LinkedList<Integer>(); 
            }
            
        }
        return res;
    }
}