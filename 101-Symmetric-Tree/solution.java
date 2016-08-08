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
    public boolean isSymmetric(TreeNode root) {
        return isSym(root,root);
    }
    
    public boolean isSym(TreeNode left , TreeNode right)
    {
        if(left == null && right == null)
        {
            return true;
        }
        if(left == null || right == null)
        {
            return false;
        }
        return (left.val == right.val) &&
        isSym(left.left,right.right) &&
        isSym(left.right,right.left);
    }
}