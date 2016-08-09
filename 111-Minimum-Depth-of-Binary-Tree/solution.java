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
    public int minDepth(TreeNode root) {
        if(root == null)
        {
            return 0;
        }
        return mDep(root,1);       
    }
    
    public int mDep(TreeNode root , int h)
    {
        if(root == null)
        {
            return h;
        }
        if(root.left == null && root.right == null) 
        {
            return h;
        }
        int lmin = Integer.MAX_VALUE;
        int rmin = Integer.MAX_VALUE;
        if(null!=root.left)
        {
            lmin = mDep(root.left,h+1);
        }
        if(null!=root.right)
        {
            rmin = mDep(root.right,h+1);
        }
        
        return Math.min(lmin,rmin);
    }
}