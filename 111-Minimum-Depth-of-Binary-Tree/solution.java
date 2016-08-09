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
        return mDep(root,1,Integer.MAX_VALUE);       
    }
    
    public int mDep(TreeNode root , int h , int m)
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
            lmin = mDep(root.left,h+1,m);
        }
        if(null!=root.right)
        {
            rmin = mDep(root.right,h+1,m);
        }
        if(lmin == 0)
        {
            return rmin;
        }
        if(rmin ==0 )
        {
            return lmin;
        }
        return Math.min(lmin,rmin);
    }
}