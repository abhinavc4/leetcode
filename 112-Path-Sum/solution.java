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
    public boolean hasPathSum(TreeNode root, int sum) {
        return hasSum(root,0,sum);
    }
    public boolean hasSum(TreeNode root , int pSum , int sum)
    {
        if(root == null)
        {
            return false;
        }
        if(root.left ==null && root.right == null)
        {
            if(pSum+root.val==sum)
            {
                return true;
            }
            return false;
        }
        boolean left = hasSum(root.left,pSum+root.val,sum);
        if(left)
        {
            return left;
        }
        boolean right = hasSum(root.right,pSum+root.val,sum);
        if(right)
        {
            return right;
        }
        return false;
    }
}