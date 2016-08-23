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
    public class result{
        int count;
        Integer element;
        result(int count)
        {
            this.count= count;
            element = null;
        }
    }
    public int kthSmallest(TreeNode root, int k) {
        result in  = new result(k);
        helper(root,in);
        return in.element;
    }
    
    public void helper(TreeNode root , result in)
    {
        if(root == null || in.element != null)
        {
            return;
        }
        helper(root.left,in);
        in.count--;
        if(in.count==0)
        {
            in.element = root.val;
        }
        helper(root.right,in);
    }
}