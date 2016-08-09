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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue <TreeNode> q = new LinkedList<TreeNode>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root == null)
        {
            return res;
        }
        q.add(root);
        int size = q.size();
        ArrayList<Integer> al = new ArrayList<Integer>();
        while(q.size()!=0)
        {
            TreeNode curr = q.remove();
            if(curr!=null)
            {
                q.add(curr.left);
                q.add(curr.right);
                al.add(curr.val);
            }
            size--;
            if(size ==0)
            {
                if(al.size()!=0)
                {
                    res.add(new ArrayList<Integer>(al));
                }
                al.clear();
                size = q.size();
            }
        }
        return res;
        
    }
}