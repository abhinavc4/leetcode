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
    public boolean isValidBST(TreeNode root) {
        if(root == null)
        {
            return true;
        }
        return helper(root, Long.MIN_VALUE,Long.MAX_VALUE);
    }
    
    public boolean helper(TreeNode root , Long min , Long max)
    {
        if(root == null)
        {
            return true;
        }
        if(min<root.val && root.val < max)
        {
            if((helper(root.left,min,(long)root.val)) &&
                (helper(root.right,(long)root.val,max)))
            {
                return true;
            }
            return false;
        }
        return false;
    }
}